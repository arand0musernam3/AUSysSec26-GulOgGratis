package org.bouncycastle.crypto.engines;

import com.braze.h2;
import i4.a;
import j4.d;
import j4.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import m0.i1;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
abstract class AEADBaseEngine implements AEADCipher {
    protected int AADBufferSize;
    protected int BlockSize;
    protected int IV_SIZE;
    protected int KEY_SIZE;
    protected int MAC_SIZE;
    protected AADOperator aadOperator;
    protected String algorithmName;
    protected DataOperator dataOperator;
    protected boolean forEncryption;
    protected byte[] initialAssociatedText;
    protected byte[] m_aad;
    protected int m_aadPos;
    protected byte[] m_buf;
    protected int m_bufPos;
    protected int m_bufferSizeDecrypt;
    protected State m_state = State.Uninitialized;
    protected byte[] mac;
    protected AADProcessingBuffer processor;

    public interface AADOperator {
        int getLen();

        void processAADByte(byte b8);

        void processAADBytes(byte[] bArr, int i11, int i12);

        void reset();
    }

    public static class AADOperatorType {
        public static final int COUNTER = 1;
        public static final int DEFAULT = 0;
        public static final int STREAM = 2;
        private final int ord;
        public static final AADOperatorType Default = new AADOperatorType(0);
        public static final AADOperatorType Counter = new AADOperatorType(1);
        public static final AADOperatorType Stream = new AADOperatorType(2);

        public AADOperatorType(int i11) {
            this.ord = i11;
        }
    }

    public interface AADProcessingBuffer {
        int getUpdateOutputSize(int i11);

        boolean isLengthExceedingBlockSize(int i11, int i12);

        boolean isLengthWithinAvailableSpace(int i11, int i12);

        void processAADByte(byte b8);

        int processByte(byte b8, byte[] bArr, int i11);
    }

    public class BufferedAADProcessor implements AADProcessingBuffer {
        private BufferedAADProcessor() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int getUpdateOutputSize(int i11) {
            return Math.max(0, i11) - 1;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i11, int i12) {
            return i11 > i12;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i11, int i12) {
            return i11 <= i12;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public void processAADByte(byte b8) {
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            if (aEADBaseEngine.m_aadPos == aEADBaseEngine.AADBufferSize) {
                aEADBaseEngine.processBufferAAD(aEADBaseEngine.m_aad, 0);
                AEADBaseEngine.this.m_aadPos = 0;
            }
            AEADBaseEngine aEADBaseEngine2 = AEADBaseEngine.this;
            byte[] bArr = aEADBaseEngine2.m_aad;
            int i11 = aEADBaseEngine2.m_aadPos;
            aEADBaseEngine2.m_aadPos = i11 + 1;
            bArr[i11] = b8;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int processByte(byte b8, byte[] bArr, int i11) {
            AEADBaseEngine.this.checkData(false);
            int iProcessEncDecByte = AEADBaseEngine.this.processEncDecByte(bArr, i11);
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            byte[] bArr2 = aEADBaseEngine.m_buf;
            int i12 = aEADBaseEngine.m_bufPos;
            aEADBaseEngine.m_bufPos = i12 + 1;
            bArr2[i12] = b8;
            return iProcessEncDecByte;
        }
    }

    public class CounterAADOperator implements AADOperator {
        private int aadLen;

        private CounterAADOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return this.aadLen;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b8) {
            this.aadLen++;
            AEADBaseEngine.this.processor.processAADByte(b8);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i11, int i12) {
            this.aadLen += i12;
            AEADBaseEngine.this.processAadBytes(bArr, i11, i12);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
            this.aadLen = 0;
        }
    }

    public class CounterDataOperator implements DataOperator {
        private int messegeLen;

        private CounterDataOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return this.messegeLen;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b8, byte[] bArr, int i11) {
            this.messegeLen++;
            return AEADBaseEngine.this.processor.processByte(b8, bArr, i11);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
            this.messegeLen += i12;
            return AEADBaseEngine.this.processEncDecBytes(bArr, i11, i12, bArr2, i13);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
            this.messegeLen = 0;
        }
    }

    public interface DataOperator {
        int getLen();

        int processByte(byte b8, byte[] bArr, int i11);

        int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

        void reset();
    }

    public static class DataOperatorType {
        public static final int COUNTER = 1;
        public static final int DEFAULT = 0;
        public static final int STREAM = 2;
        public static final int STREAM_CIPHER = 3;
        private final int ord;
        public static final DataOperatorType Default = new DataOperatorType(0);
        public static final DataOperatorType Counter = new DataOperatorType(1);
        public static final DataOperatorType Stream = new DataOperatorType(2);
        public static final DataOperatorType StreamCipher = new DataOperatorType(3);

        public DataOperatorType(int i11) {
            this.ord = i11;
        }
    }

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public class ImmediateAADProcessor implements AADProcessingBuffer {
        private ImmediateAADProcessor() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int getUpdateOutputSize(int i11) {
            return Math.max(0, i11);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i11, int i12) {
            return i11 >= i12;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i11, int i12) {
            return i11 < i12;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public void processAADByte(byte b8) {
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            byte[] bArr = aEADBaseEngine.m_aad;
            int i11 = aEADBaseEngine.m_aadPos;
            int i12 = i11 + 1;
            aEADBaseEngine.m_aadPos = i12;
            bArr[i11] = b8;
            if (i12 == aEADBaseEngine.AADBufferSize) {
                aEADBaseEngine.processBufferAAD(bArr, 0);
                AEADBaseEngine.this.m_aadPos = 0;
            }
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int processByte(byte b8, byte[] bArr, int i11) {
            AEADBaseEngine.this.checkData(false);
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            byte[] bArr2 = aEADBaseEngine.m_buf;
            int i12 = aEADBaseEngine.m_bufPos;
            aEADBaseEngine.m_bufPos = i12 + 1;
            bArr2[i12] = b8;
            return aEADBaseEngine.processEncDecByte(bArr, i11);
        }
    }

    public static class ProcessingBufferType {
        public static final int BUFFERED = 0;
        public static final int IMMEDIATE = 1;
        private final int ord;
        public static final ProcessingBufferType Buffered = new ProcessingBufferType(0);
        public static final ProcessingBufferType Immediate = new ProcessingBufferType(1);

        public ProcessingBufferType(int i11) {
            this.ord = i11;
        }
    }

    public static class State {
        public static final int DEC_AAD = 6;
        public static final int DEC_DATA = 7;
        public static final int DEC_FINAL = 8;
        public static final int DEC_INIT = 5;
        public static final int ENC_AAD = 2;
        public static final int ENC_DATA = 3;
        public static final int ENC_FINAL = 4;
        public static final int ENC_INIT = 1;
        public static final int UNINITIALIZED = 0;
        final int ord;
        public static final State Uninitialized = new State(0);
        public static final State EncInit = new State(1);
        public static final State EncAad = new State(2);
        public static final State EncData = new State(3);
        public static final State EncFinal = new State(4);
        public static final State DecInit = new State(5);
        public static final State DecAad = new State(6);
        public static final State DecData = new State(7);
        public static final State DecFinal = new State(8);

        public State(int i11) {
            this.ord = i11;
        }
    }

    public static class StreamAADOperator implements AADOperator {
        private final ErasableOutputStream stream = new ErasableOutputStream();

        public byte[] getBytes() {
            return this.stream.getBuf();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return this.stream.size();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b8) throws IOException {
            this.stream.write(b8);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i11, int i12) throws IOException {
            this.stream.write(bArr, i11, i12);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
            this.stream.reset();
        }
    }

    public class StreamDataOperator implements DataOperator {
        private final ErasableOutputStream stream = new ErasableOutputStream();

        public StreamDataOperator() {
        }

        public byte[] getBytes() {
            return this.stream.getBuf();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return this.stream.size();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b8, byte[] bArr, int i11) throws IOException {
            AEADBaseEngine.this.ensureInitialized();
            this.stream.write(b8);
            AEADBaseEngine.this.m_bufPos = this.stream.size();
            return 0;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws IOException {
            AEADBaseEngine.this.ensureInitialized();
            this.stream.write(bArr, i11, i12);
            AEADBaseEngine.this.m_bufPos = this.stream.size();
            return 0;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
            this.stream.reset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAadBytes(byte[] bArr, int i11, int i12) {
        int i13 = this.m_aadPos;
        if (i13 > 0) {
            int i14 = this.AADBufferSize - i13;
            boolean zIsLengthWithinAvailableSpace = this.processor.isLengthWithinAvailableSpace(i12, i14);
            byte[] bArr2 = this.m_aad;
            if (zIsLengthWithinAvailableSpace) {
                System.arraycopy(bArr, i11, bArr2, this.m_aadPos, i12);
                this.m_aadPos += i12;
                return;
            } else {
                System.arraycopy(bArr, i11, bArr2, this.m_aadPos, i14);
                i11 += i14;
                i12 -= i14;
                processBufferAAD(this.m_aad, 0);
            }
        }
        while (this.processor.isLengthExceedingBlockSize(i12, this.AADBufferSize)) {
            processBufferAAD(bArr, i11);
            int i15 = this.AADBufferSize;
            i11 += i15;
            i12 -= i15;
        }
        System.arraycopy(bArr, i11, this.m_aad, 0, i12);
        this.m_aadPos = i12;
    }

    public void checkAAD() {
        int i11 = this.m_state.ord;
        if (i11 == 1) {
            this.m_state = State.EncAad;
            return;
        }
        if (i11 != 2) {
            if (i11 == 4) {
                h2.b(k.p(new StringBuilder(), getAlgorithmName(), " cannot be reused for encryption"));
            } else if (i11 == 5) {
                this.m_state = State.DecAad;
            } else {
                if (i11 == 6) {
                    return;
                }
                h2.b(k.p(new StringBuilder(), getAlgorithmName(), " needs to be initialized"));
            }
        }
    }

    public boolean checkData(boolean z11) {
        StringBuilder sb2;
        String algorithmName;
        String str;
        switch (this.m_state.ord) {
            case 1:
            case 2:
                finishAAD(State.EncData, z11);
                return true;
            case 3:
                return true;
            case 4:
                sb2 = new StringBuilder();
                algorithmName = getAlgorithmName();
                str = " cannot be reused for encryption";
                break;
            case 5:
            case 6:
                finishAAD(State.DecData, z11);
                return false;
            case 7:
                return false;
            default:
                sb2 = new StringBuilder();
                algorithmName = getAlgorithmName();
                str = " needs to be initialized";
                break;
        }
        h2.b(k.p(sb2, algorithmName, str));
        return false;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException {
        int i12;
        boolean zCheckData = checkData(true);
        int i13 = this.m_bufPos;
        int i14 = this.MAC_SIZE;
        if (zCheckData) {
            i12 = i13 + i14;
        } else {
            if (i13 < i14) {
                i1.i("data too short");
                return 0;
            }
            i12 = i13 - i14;
            this.m_bufPos = i12;
        }
        ensureSufficientOutputBuffer(bArr, i11, i12);
        this.mac = new byte[this.MAC_SIZE];
        processFinalBlock(bArr, i11);
        if (zCheckData) {
            byte[] bArr2 = this.mac;
            int i15 = this.MAC_SIZE;
            System.arraycopy(bArr2, 0, bArr, (i11 + i12) - i15, i15);
        } else if (!Arrays.constantTimeAreEqual(this.MAC_SIZE, this.mac, 0, this.m_buf, this.m_bufPos)) {
            throw new InvalidCipherTextException(k.p(new StringBuilder(), this.algorithmName, " mac does not match"));
        }
        reset(!zCheckData);
        return i12;
    }

    public final void ensureInitialized() {
        if (this.m_state != State.Uninitialized) {
            return;
        }
        h2.b("Need to call init function before operation");
    }

    public final void ensureSufficientInputBuffer(byte[] bArr, int i11, int i12) {
        if (i11 + i12 <= bArr.length) {
            return;
        }
        i1.t("input buffer too short");
    }

    public final void ensureSufficientOutputBuffer(byte[] bArr, int i11, int i12) {
        if (i11 + i12 <= bArr.length) {
            return;
        }
        i1.r("output buffer too short");
    }

    public abstract void finishAAD(State state, boolean z11);

    public void finishAAD1(State state) {
        int i11 = this.m_state.ord;
        if (i11 == 1 || i11 == 2 || i11 == 5 || i11 == 6) {
            processFinalAAD();
        }
        this.m_state = state;
    }

    public void finishAAD2(State state) {
        int i11 = this.m_state.ord;
        if (i11 == 2 || i11 == 6) {
            processFinalAAD();
        }
        this.m_aadPos = 0;
        this.m_state = state;
    }

    public void finishAAD3(State state, boolean z11) {
        int i11 = this.m_state.ord;
        if (i11 == 1 || i11 == 2) {
            processFinalAAD();
        } else if (i11 == 5 || i11 == 6) {
            if (!z11 && this.dataOperator.getLen() <= this.MAC_SIZE) {
                return;
            }
            processFinalAAD();
        }
        this.m_aadPos = 0;
        this.m_state = state;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public final int getBlockSize() {
        return this.BlockSize;
    }

    public int getIVBytesSize() {
        return this.IV_SIZE;
    }

    public int getKeyBytesSize() {
        return this.KEY_SIZE;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.mac;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i11) {
        int iMax = Math.max(0, i11);
        switch (this.m_state.ord) {
            case 3:
            case 4:
                return iMax + this.m_bufPos + this.MAC_SIZE;
            case 5:
            case 6:
            case 7:
            case 8:
                return Math.max(0, (iMax + this.m_bufPos) - this.MAC_SIZE);
            default:
                return iMax + this.MAC_SIZE;
        }
    }

    public int getTotalBytesForUpdate(int i11) {
        int i12;
        int updateOutputSize = this.processor.getUpdateOutputSize(i11);
        switch (this.m_state.ord) {
            case 3:
            case 4:
                i12 = updateOutputSize + this.m_bufPos;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                i12 = (updateOutputSize + this.m_bufPos) - this.MAC_SIZE;
                break;
            default:
                return updateOutputSize;
        }
        return Math.max(0, i12);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        int totalBytesForUpdate = getTotalBytesForUpdate(i11);
        return totalBytesForUpdate - (totalBytesForUpdate % this.BlockSize);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        KeyParameter key;
        byte[] iv2;
        this.forEncryption = z11;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            key = aEADParameters.getKey();
            iv2 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize != this.MAC_SIZE * 8) {
                a.f(s.f(macSize, "Invalid value for MAC size: "));
                return;
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                d.t(this.algorithmName, "invalid parameters passed to ");
                return;
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            key = (KeyParameter) parametersWithIV.getParameters();
            iv2 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
        }
        if (key == null) {
            a.f(k.p(new StringBuilder(), this.algorithmName, " Init parameters must include a key"));
            return;
        }
        if (iv2 == null || iv2.length != this.IV_SIZE) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.algorithmName);
            sb2.append(" requires exactly ");
            a.f(k.i(this.IV_SIZE, " bytes of IV", sb2));
            return;
        }
        byte[] key2 = key.getKey();
        if (key2.length != this.KEY_SIZE) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.algorithmName);
            sb3.append(" key must be ");
            a.f(k.i(this.KEY_SIZE, " bytes long", sb3));
            return;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z11)));
        this.m_state = z11 ? State.EncInit : State.DecInit;
        init(key2, iv2);
        reset(true);
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public abstract void init(byte[] bArr, byte[] bArr2);

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b8) {
        checkAAD();
        this.aadOperator.processAADByte(b8);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        ensureSufficientInputBuffer(bArr, i11, i12);
        if (i12 <= 0) {
            return;
        }
        checkAAD();
        this.aadOperator.processAADBytes(bArr, i11, i12);
    }

    public abstract void processBufferAAD(byte[] bArr, int i11);

    public abstract void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12);

    public abstract void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12);

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b8, byte[] bArr, int i11) throws DataLengthException {
        return this.dataOperator.processByte(b8, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws DataLengthException {
        ensureSufficientInputBuffer(bArr, i11, i12);
        return this.dataOperator.processBytes(bArr, i11, i12, bArr2, i13);
    }

    public int processEncDecByte(byte[] bArr, int i11) {
        if ((this.forEncryption ? this.BlockSize : this.m_bufferSizeDecrypt) - this.m_bufPos != 0) {
            return 0;
        }
        ensureSufficientOutputBuffer(bArr, i11, this.BlockSize);
        boolean z11 = this.forEncryption;
        byte[] bArr2 = this.m_buf;
        if (z11) {
            processBufferEncrypt(bArr2, 0, bArr, i11);
        } else {
            processBufferDecrypt(bArr2, 0, bArr, i11);
            byte[] bArr3 = this.m_buf;
            int i12 = this.BlockSize;
            System.arraycopy(bArr3, i12, bArr3, 0, this.m_bufPos - i12);
        }
        int i13 = this.m_bufPos;
        int i14 = this.BlockSize;
        this.m_bufPos = i13 - i14;
        return i14;
    }

    public int processEncDecBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14;
        boolean zCheckData = checkData(false);
        int i15 = (zCheckData ? this.BlockSize : this.m_bufferSizeDecrypt) - this.m_bufPos;
        if (this.processor.isLengthWithinAvailableSpace(i12, i15)) {
            System.arraycopy(bArr, i11, this.m_buf, this.m_bufPos, i12);
            this.m_bufPos += i12;
            return 0;
        }
        int updateOutputSize = this.processor.getUpdateOutputSize(i12);
        int i16 = (this.m_bufPos + updateOutputSize) - (zCheckData ? 0 : this.MAC_SIZE);
        ensureSufficientOutputBuffer(bArr2, i13, i16 - (i16 % this.BlockSize));
        if (bArr == bArr2 && Arrays.segmentsOverlap(i11, i12, i13, updateOutputSize)) {
            bArr = new byte[i12];
            System.arraycopy(bArr2, i11, bArr, 0, i12);
            i11 = 0;
        }
        if (zCheckData) {
            int i17 = this.m_bufPos;
            if (i17 > 0) {
                System.arraycopy(bArr, i11, this.m_buf, i17, i15);
                i11 += i15;
                i12 -= i15;
                processBufferEncrypt(this.m_buf, 0, bArr2, i13);
                i14 = this.BlockSize;
            } else {
                i14 = 0;
            }
            while (this.processor.isLengthExceedingBlockSize(i12, this.BlockSize)) {
                processBufferEncrypt(bArr, i11, bArr2, i13 + i14);
                int i18 = this.BlockSize;
                i11 += i18;
                i12 -= i18;
                i14 += i18;
            }
        } else {
            i14 = 0;
            while (this.processor.isLengthExceedingBlockSize(this.m_bufPos, this.BlockSize) && this.processor.isLengthExceedingBlockSize(this.m_bufPos + i12, this.m_bufferSizeDecrypt)) {
                processBufferDecrypt(this.m_buf, i14, bArr2, i13 + i14);
                int i19 = this.m_bufPos;
                int i21 = this.BlockSize;
                this.m_bufPos = i19 - i21;
                i14 += i21;
            }
            int i22 = this.m_bufPos;
            if (i22 > 0) {
                byte[] bArr3 = this.m_buf;
                System.arraycopy(bArr3, i14, bArr3, 0, i22);
                if (this.processor.isLengthWithinAvailableSpace(this.m_bufPos + i12, this.m_bufferSizeDecrypt)) {
                    System.arraycopy(bArr, i11, this.m_buf, this.m_bufPos, i12);
                    this.m_bufPos += i12;
                    return i14;
                }
                int iMax = Math.max(this.BlockSize - this.m_bufPos, 0);
                System.arraycopy(bArr, i11, this.m_buf, this.m_bufPos, iMax);
                i11 += iMax;
                i12 -= iMax;
                processBufferDecrypt(this.m_buf, 0, bArr2, i13 + i14);
                i14 += this.BlockSize;
            }
            while (this.processor.isLengthExceedingBlockSize(i12, this.m_bufferSizeDecrypt)) {
                processBufferDecrypt(bArr, i11, bArr2, i13 + i14);
                int i23 = this.BlockSize;
                i11 += i23;
                i12 -= i23;
                i14 += i23;
            }
        }
        System.arraycopy(bArr, i11, this.m_buf, 0, i12);
        this.m_bufPos = i12;
        return i14;
    }

    public abstract void processFinalAAD();

    public abstract void processFinalBlock(byte[] bArr, int i11);

    public void reset(boolean z11) {
        ensureInitialized();
        if (z11) {
            this.mac = null;
        }
        byte[] bArr = this.m_buf;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.m_bufPos = 0;
        }
        byte[] bArr2 = this.m_aad;
        if (bArr2 != null) {
            Arrays.fill(bArr2, (byte) 0);
            this.m_aadPos = 0;
        }
        switch (this.m_state.ord) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.m_state = State.EncFinal;
                return;
            case 6:
            case 7:
            case 8:
                this.m_state = State.DecFinal;
                break;
            default:
                h2.b(k.p(new StringBuilder(), getAlgorithmName(), " needs to be initialized"));
                return;
        }
        this.aadOperator.reset();
        this.dataOperator.reset();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setInnerMembers(org.bouncycastle.crypto.engines.AEADBaseEngine.ProcessingBufferType r4, org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperatorType r5, org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperatorType r6) {
        /*
            r3 = this;
            int r4 = org.bouncycastle.crypto.engines.AEADBaseEngine.ProcessingBufferType.access$000(r4)
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L13
            if (r4 == r0) goto Lb
            goto L19
        Lb:
            org.bouncycastle.crypto.engines.AEADBaseEngine$ImmediateAADProcessor r4 = new org.bouncycastle.crypto.engines.AEADBaseEngine$ImmediateAADProcessor
            r4.<init>()
        L10:
            r3.processor = r4
            goto L19
        L13:
            org.bouncycastle.crypto.engines.AEADBaseEngine$BufferedAADProcessor r4 = new org.bouncycastle.crypto.engines.AEADBaseEngine$BufferedAADProcessor
            r4.<init>()
            goto L10
        L19:
            int r4 = r3.BlockSize
            int r2 = r3.MAC_SIZE
            int r4 = r4 + r2
            r3.m_bufferSizeDecrypt = r4
            int r4 = org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperatorType.access$300(r5)
            r5 = 0
            r2 = 2
            if (r4 == 0) goto L43
            if (r4 == r0) goto L37
            if (r4 == r2) goto L2d
            goto L4f
        L2d:
            r3.AADBufferSize = r5
            org.bouncycastle.crypto.engines.AEADBaseEngine$StreamAADOperator r4 = new org.bouncycastle.crypto.engines.AEADBaseEngine$StreamAADOperator
            r4.<init>()
        L34:
            r3.aadOperator = r4
            goto L4f
        L37:
            int r4 = r3.AADBufferSize
            byte[] r4 = new byte[r4]
            r3.m_aad = r4
            org.bouncycastle.crypto.engines.AEADBaseEngine$CounterAADOperator r4 = new org.bouncycastle.crypto.engines.AEADBaseEngine$CounterAADOperator
            r4.<init>()
            goto L34
        L43:
            int r4 = r3.AADBufferSize
            byte[] r4 = new byte[r4]
            r3.m_aad = r4
            org.bouncycastle.crypto.engines.AEADBaseEngine$DefaultAADOperator r4 = new org.bouncycastle.crypto.engines.AEADBaseEngine$DefaultAADOperator
            r4.<init>()
            goto L34
        L4f:
            int r4 = org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperatorType.access$600(r6)
            if (r4 == 0) goto L85
            if (r4 == r0) goto L79
            if (r4 == r2) goto L6d
            r6 = 3
            if (r4 == r6) goto L5d
            return
        L5d:
            r3.BlockSize = r5
            int r4 = r3.m_bufferSizeDecrypt
            byte[] r4 = new byte[r4]
            r3.m_buf = r4
            org.bouncycastle.crypto.engines.AEADBaseEngine$StreamCipherOperator r4 = new org.bouncycastle.crypto.engines.AEADBaseEngine$StreamCipherOperator
            r4.<init>()
        L6a:
            r3.dataOperator = r4
            return
        L6d:
            int r4 = r3.MAC_SIZE
            byte[] r4 = new byte[r4]
            r3.m_buf = r4
            org.bouncycastle.crypto.engines.AEADBaseEngine$StreamDataOperator r4 = new org.bouncycastle.crypto.engines.AEADBaseEngine$StreamDataOperator
            r4.<init>()
            goto L6a
        L79:
            int r4 = r3.m_bufferSizeDecrypt
            byte[] r4 = new byte[r4]
            r3.m_buf = r4
            org.bouncycastle.crypto.engines.AEADBaseEngine$CounterDataOperator r4 = new org.bouncycastle.crypto.engines.AEADBaseEngine$CounterDataOperator
            r4.<init>()
            goto L6a
        L85:
            int r4 = r3.m_bufferSizeDecrypt
            byte[] r4 = new byte[r4]
            r3.m_buf = r4
            org.bouncycastle.crypto.engines.AEADBaseEngine$DefaultDataOperator r4 = new org.bouncycastle.crypto.engines.AEADBaseEngine$DefaultDataOperator
            r4.<init>()
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.AEADBaseEngine.setInnerMembers(org.bouncycastle.crypto.engines.AEADBaseEngine$ProcessingBufferType, org.bouncycastle.crypto.engines.AEADBaseEngine$AADOperatorType, org.bouncycastle.crypto.engines.AEADBaseEngine$DataOperatorType):void");
    }

    public class DefaultAADOperator implements AADOperator {
        private DefaultAADOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return AEADBaseEngine.this.m_aadPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b8) {
            AEADBaseEngine.this.processor.processAADByte(b8);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i11, int i12) {
            AEADBaseEngine.this.processAadBytes(bArr, i11, i12);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
        }
    }

    public class DefaultDataOperator implements DataOperator {
        private DefaultDataOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return AEADBaseEngine.this.m_bufPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b8, byte[] bArr, int i11) {
            return AEADBaseEngine.this.processor.processByte(b8, bArr, i11);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
            return AEADBaseEngine.this.processEncDecBytes(bArr, i11, i12, bArr2, i13);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
        }
    }

    public class StreamCipherOperator implements DataOperator {
        private int len;

        private StreamCipherOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return this.len;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b8, byte[] bArr, int i11) {
            if (AEADBaseEngine.this.checkData(false)) {
                this.len = 1;
                AEADBaseEngine.this.processBufferEncrypt(new byte[]{b8}, 0, bArr, i11);
                return 1;
            }
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            int i12 = aEADBaseEngine.m_bufPos;
            if (i12 != aEADBaseEngine.MAC_SIZE) {
                byte[] bArr2 = aEADBaseEngine.m_buf;
                aEADBaseEngine.m_bufPos = i12 + 1;
                bArr2[i12] = b8;
                return 0;
            }
            this.len = 1;
            aEADBaseEngine.processBufferDecrypt(aEADBaseEngine.m_buf, 0, bArr, i11);
            AEADBaseEngine aEADBaseEngine2 = AEADBaseEngine.this;
            byte[] bArr3 = aEADBaseEngine2.m_buf;
            System.arraycopy(bArr3, 1, bArr3, 0, aEADBaseEngine2.m_bufPos - 1);
            AEADBaseEngine aEADBaseEngine3 = AEADBaseEngine.this;
            aEADBaseEngine3.m_buf[aEADBaseEngine3.m_bufPos - 1] = b8;
            return 1;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
            int i14 = 0;
            if (bArr == bArr2 && Arrays.segmentsOverlap(i11, i12, i13, AEADBaseEngine.this.processor.getUpdateOutputSize(i12))) {
                bArr = new byte[i12];
                System.arraycopy(bArr2, i11, bArr, 0, i12);
                i11 = 0;
            }
            if (AEADBaseEngine.this.checkData(false)) {
                this.len = i12;
                AEADBaseEngine.this.processBufferEncrypt(bArr, i11, bArr2, i13);
                return i12;
            }
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            int iMax = Math.max((aEADBaseEngine.m_bufPos + i12) - aEADBaseEngine.MAC_SIZE, 0);
            int i15 = AEADBaseEngine.this.m_bufPos;
            if (i15 > 0) {
                int iMin = Math.min(iMax, i15);
                this.len = iMin;
                AEADBaseEngine aEADBaseEngine2 = AEADBaseEngine.this;
                aEADBaseEngine2.processBufferDecrypt(aEADBaseEngine2.m_buf, 0, bArr2, i13);
                iMax -= iMin;
                AEADBaseEngine aEADBaseEngine3 = AEADBaseEngine.this;
                int i16 = aEADBaseEngine3.m_bufPos - iMin;
                aEADBaseEngine3.m_bufPos = i16;
                byte[] bArr3 = aEADBaseEngine3.m_buf;
                System.arraycopy(bArr3, iMin, bArr3, 0, i16);
                i14 = iMin;
            }
            if (iMax > 0) {
                this.len = iMax;
                AEADBaseEngine.this.processBufferDecrypt(bArr, i11, bArr2, i13);
                i14 += iMax;
                i12 -= iMax;
                i11 += iMax;
            }
            AEADBaseEngine aEADBaseEngine4 = AEADBaseEngine.this;
            System.arraycopy(bArr, i11, aEADBaseEngine4.m_buf, aEADBaseEngine4.m_bufPos, i12);
            AEADBaseEngine.this.m_bufPos += i12;
            return i14;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }
}
