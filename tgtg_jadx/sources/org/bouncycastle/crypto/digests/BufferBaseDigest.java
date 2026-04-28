package org.bouncycastle.crypto.digests;

import m0.i1;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
abstract class BufferBaseDigest implements ExtendedDigest {
    protected int BlockSize;
    protected int DigestSize;
    protected String algorithmName;
    protected byte[] m_buf;
    protected int m_bufPos;
    protected ProcessingBuffer processor;

    public class BufferedProcessor implements ProcessingBuffer {
        private BufferedProcessor() {
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i11, int i12) {
            return i11 > i12;
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i11, int i12) {
            return i11 <= i12;
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public void update(byte b8) {
            BufferBaseDigest bufferBaseDigest = BufferBaseDigest.this;
            if (bufferBaseDigest.m_bufPos == bufferBaseDigest.BlockSize) {
                bufferBaseDigest.processBytes(bufferBaseDigest.m_buf, 0);
                BufferBaseDigest.this.m_bufPos = 0;
            }
            BufferBaseDigest bufferBaseDigest2 = BufferBaseDigest.this;
            byte[] bArr = bufferBaseDigest2.m_buf;
            int i11 = bufferBaseDigest2.m_bufPos;
            bufferBaseDigest2.m_bufPos = i11 + 1;
            bArr[i11] = b8;
        }
    }

    public class ImmediateProcessor implements ProcessingBuffer {
        private ImmediateProcessor() {
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i11, int i12) {
            return i11 >= i12;
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i11, int i12) {
            return i11 < i12;
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public void update(byte b8) {
            BufferBaseDigest bufferBaseDigest = BufferBaseDigest.this;
            byte[] bArr = bufferBaseDigest.m_buf;
            int i11 = bufferBaseDigest.m_bufPos;
            bArr[i11] = b8;
            int i12 = i11 + 1;
            bufferBaseDigest.m_bufPos = i12;
            if (i12 == bufferBaseDigest.BlockSize) {
                bufferBaseDigest.processBytes(bArr, 0);
                BufferBaseDigest.this.m_bufPos = 0;
            }
        }
    }

    public interface ProcessingBuffer {
        boolean isLengthExceedingBlockSize(int i11, int i12);

        boolean isLengthWithinAvailableSpace(int i11, int i12);

        void update(byte b8);
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

    public BufferBaseDigest(ProcessingBufferType processingBufferType, int i11) {
        ProcessingBuffer bufferedProcessor;
        this.BlockSize = i11;
        this.m_buf = new byte[i11];
        int i12 = processingBufferType.ord;
        if (i12 == 0) {
            bufferedProcessor = new BufferedProcessor();
        } else if (i12 != 1) {
            return;
        } else {
            bufferedProcessor = new ImmediateProcessor();
        }
        this.processor = bufferedProcessor;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        ensureSufficientOutputBuffer(bArr, i11);
        finish(bArr, i11);
        reset();
        return this.DigestSize;
    }

    public void ensureSufficientInputBuffer(byte[] bArr, int i11, int i12) {
        if (i11 + i12 <= bArr.length) {
            return;
        }
        i1.t("input buffer too short");
    }

    public void ensureSufficientOutputBuffer(byte[] bArr, int i11) {
        if (this.DigestSize + i11 <= bArr.length) {
            return;
        }
        i1.r("output buffer is too short");
    }

    public abstract void finish(byte[] bArr, int i11);

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.BlockSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.DigestSize;
    }

    public abstract void processBytes(byte[] bArr, int i11);

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.clear(this.m_buf);
        this.m_bufPos = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        ensureSufficientInputBuffer(bArr, i11, i12);
        int i13 = this.BlockSize - this.m_bufPos;
        if (this.processor.isLengthWithinAvailableSpace(i12, i13)) {
            System.arraycopy(bArr, i11, this.m_buf, this.m_bufPos, i12);
            this.m_bufPos += i12;
            return;
        }
        int i14 = this.m_bufPos;
        if (i14 > 0) {
            System.arraycopy(bArr, i11, this.m_buf, i14, i13);
            i11 += i13;
            i12 -= i13;
            processBytes(this.m_buf, 0);
        }
        while (this.processor.isLengthExceedingBlockSize(i12, this.BlockSize)) {
            processBytes(bArr, i11);
            int i15 = this.BlockSize;
            i11 += i15;
            i12 -= i15;
        }
        System.arraycopy(bArr, i11, this.m_buf, 0, i12);
        this.m_bufPos = i12;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b8) {
        this.processor.update(b8);
    }
}
