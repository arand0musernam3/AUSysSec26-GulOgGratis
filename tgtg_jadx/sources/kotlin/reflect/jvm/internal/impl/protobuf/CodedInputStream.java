package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class CodedInputStream {
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public interface RefillCallback {
        void onRefill();
    }

    private CodedInputStream(LiteralByteString literalByteString) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = literalByteString.bytes;
        int offsetIntoBytes = literalByteString.getOffsetIntoBytes();
        this.bufferPos = offsetIntoBytes;
        this.bufferSize = offsetIntoBytes + literalByteString.size();
        this.totalBytesRetired = -this.bufferPos;
        this.input = null;
        this.bufferIsImmutable = true;
    }

    public static int decodeZigZag32(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static long decodeZigZag64(long j9) {
        return (-(j9 & 1)) ^ (j9 >>> 1);
    }

    private void ensureAvailable(int i11) throws IOException {
        if (this.bufferSize - this.bufferPos < i11) {
            refillBuffer(i11);
        }
    }

    public static CodedInputStream newInstance(LiteralByteString literalByteString) {
        CodedInputStream codedInputStream = new CodedInputStream(literalByteString);
        try {
            codedInputStream.pushLimit(literalByteString.size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    private byte[] readRawBytesSlowPath(int i11) throws IOException {
        if (i11 <= 0) {
            if (i11 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i12 = this.totalBytesRetired;
        int i13 = this.bufferPos;
        int i14 = i12 + i13 + i11;
        int i15 = this.currentLimit;
        if (i14 > i15) {
            skipRawBytes((i15 - i12) - i13);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i11 < 4096) {
            byte[] bArr = new byte[i11];
            int i16 = this.bufferSize - i13;
            System.arraycopy(this.buffer, i13, bArr, 0, i16);
            this.bufferPos = this.bufferSize;
            int i17 = i11 - i16;
            ensureAvailable(i17);
            System.arraycopy(this.buffer, 0, bArr, i16, i17);
            this.bufferPos = i17;
            return bArr;
        }
        int i18 = this.bufferSize;
        this.totalBytesRetired = i12 + i18;
        this.bufferPos = 0;
        this.bufferSize = 0;
        int length = i18 - i13;
        int i19 = i11 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i19 > 0) {
            int iMin = Math.min(i19, 4096);
            byte[] bArr2 = new byte[iMin];
            int i21 = 0;
            while (i21 < iMin) {
                InputStream inputStream = this.input;
                int i22 = inputStream == null ? -1 : inputStream.read(bArr2, i21, iMin - i21);
                if (i22 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i22;
                i21 += i22;
            }
            i19 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i11];
        System.arraycopy(this.buffer, i13, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    private void recomputeBufferSizeAfterLimit() {
        int i11 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i11;
        int i12 = this.totalBytesRetired + i11;
        int i13 = this.currentLimit;
        if (i12 <= i13) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i14 = i12 - i13;
        this.bufferSizeAfterLimit = i14;
        this.bufferSize = i11 - i14;
    }

    private void refillBuffer(int i11) throws IOException {
        if (!tryRefillBuffer(i11)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void skipRawBytesSlowPath(int i11) throws IOException {
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i12 = this.totalBytesRetired;
        int i13 = this.bufferPos;
        int i14 = i12 + i13 + i11;
        int i15 = this.currentLimit;
        if (i14 > i15) {
            skipRawBytes((i15 - i12) - i13);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i16 = this.bufferSize;
        int i17 = i16 - i13;
        this.bufferPos = i16;
        refillBuffer(1);
        while (true) {
            int i18 = i11 - i17;
            int i19 = this.bufferSize;
            if (i18 <= i19) {
                this.bufferPos = i18;
                return;
            } else {
                i17 += i19;
                this.bufferPos = i19;
                refillBuffer(1);
            }
        }
    }

    private boolean tryRefillBuffer(int i11) throws IOException {
        int i12 = this.bufferPos;
        if (i12 + i11 <= this.bufferSize) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i11);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.totalBytesRetired + i12 + i11 > this.currentLimit) {
            return false;
        }
        RefillCallback refillCallback = this.refillCallback;
        if (refillCallback != null) {
            refillCallback.onRefill();
        }
        if (this.input != null) {
            int i13 = this.bufferPos;
            if (i13 > 0) {
                int i14 = this.bufferSize;
                if (i14 > i13) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i13, bArr, 0, i14 - i13);
                }
                this.totalBytesRetired += i13;
                this.bufferSize -= i13;
                this.bufferPos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i15 = this.bufferSize;
            int i16 = inputStream.read(bArr2, i15, bArr2.length - i15);
            if (i16 == 0 || i16 < -1 || i16 > this.buffer.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i16);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i16 > 0) {
                this.bufferSize += i16;
                if ((this.totalBytesRetired + i11) - this.sizeLimit > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                recomputeBufferSizeAfterLimit();
                if (this.bufferSize >= i11) {
                    return true;
                }
                return tryRefillBuffer(i11);
            }
        }
        return false;
    }

    public void checkLastTagWas(int i11) throws InvalidProtocolBufferException {
        if (this.lastTag != i11) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i11 = this.currentLimit;
        if (i11 == Integer.MAX_VALUE) {
            return -1;
        }
        return i11 - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() throws IOException {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    public void popLimit(int i11) {
        this.currentLimit = i11;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i11) throws InvalidProtocolBufferException {
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i12 = this.totalBytesRetired + this.bufferPos + i11;
        int i13 = this.currentLimit;
        if (i12 > i13) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.currentLimit = i12;
        recomputeBufferSizeAfterLimit();
        return i13;
    }

    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    public ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i11 = this.bufferSize;
        int i12 = this.bufferPos;
        if (rawVarint32 > i11 - i12 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? ByteString.EMPTY : new LiteralByteString(readRawBytesSlowPath(rawVarint32));
        }
        ByteString boundedByteString = (this.bufferIsImmutable && this.enableAliasing) ? new BoundedByteString(this.buffer, this.bufferPos, rawVarint32) : ByteString.copyFrom(this.buffer, i12, rawVarint32);
        this.bufferPos += rawVarint32;
        return boundedByteString;
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(int i11, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i12 = this.recursionDepth;
        if (i12 >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.recursionDepth = i12 + 1;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i11, 4));
        this.recursionDepth--;
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
        return partialFrom;
    }

    public byte readRawByte() throws IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i11 = this.bufferPos;
        this.bufferPos = i11 + 1;
        return bArr[i11];
    }

    public int readRawLittleEndian32() throws IOException {
        int i11 = this.bufferPos;
        if (this.bufferSize - i11 < 4) {
            refillBuffer(4);
            i11 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i11 + 4;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public long readRawLittleEndian64() throws IOException {
        int i11 = this.bufferPos;
        if (this.bufferSize - i11 < 8) {
            refillBuffer(8);
            i11 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i11 + 8;
        return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
    }

    public int readRawVarint32() throws IOException {
        int i11;
        int i12 = this.bufferPos;
        int i13 = this.bufferSize;
        if (i13 != i12) {
            byte[] bArr = this.buffer;
            int i14 = i12 + 1;
            byte b8 = bArr[i12];
            if (b8 >= 0) {
                this.bufferPos = i14;
                return b8;
            }
            if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b8;
                long j9 = i16;
                if (j9 < 0) {
                    i11 = (int) ((-128) ^ j9);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    long j11 = i18;
                    if (j11 >= 0) {
                        i11 = (int) (16256 ^ j11);
                    } else {
                        int i19 = i12 + 4;
                        int i21 = i18 ^ (bArr[i17] << 21);
                        long j12 = i21;
                        if (j12 < 0) {
                            i11 = (int) ((-2080896) ^ j12);
                        } else {
                            i17 = i12 + 5;
                            byte b11 = bArr[i19];
                            int i22 = (int) (((long) (i21 ^ (b11 << 28))) ^ 266354560);
                            if (b11 < 0) {
                                i19 = i12 + 6;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 7;
                                    if (bArr[i19] < 0) {
                                        i19 = i12 + 8;
                                        if (bArr[i17] < 0) {
                                            i17 = i12 + 9;
                                            if (bArr[i19] < 0) {
                                                int i23 = i12 + 10;
                                                if (bArr[i17] >= 0) {
                                                    i15 = i23;
                                                    i11 = i22;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i22;
                            }
                            i11 = i22;
                        }
                        i15 = i19;
                    }
                    i15 = i17;
                }
                this.bufferPos = i15;
                return i11;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    public long readRawVarint64() throws IOException {
        long j9;
        long j11;
        long j12;
        int i11 = this.bufferPos;
        int i12 = this.bufferSize;
        if (i12 != i11) {
            byte[] bArr = this.buffer;
            int i13 = i11 + 1;
            byte b8 = bArr[i11];
            if (b8 >= 0) {
                this.bufferPos = i13;
                return b8;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                long j13 = (bArr[i13] << 7) ^ b8;
                if (j13 >= 0) {
                    int i15 = i11 + 3;
                    long j14 = j13 ^ ((long) (bArr[i14] << 14));
                    if (j14 >= 0) {
                        j12 = 16256;
                    } else {
                        i14 = i11 + 4;
                        j13 = j14 ^ ((long) (bArr[i15] << 21));
                        if (j13 < 0) {
                            j11 = -2080896;
                        } else {
                            i15 = i11 + 5;
                            j14 = j13 ^ (((long) bArr[i14]) << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                i14 = i11 + 6;
                                j13 = j14 ^ (((long) bArr[i15]) << 35);
                                if (j13 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i15 = i11 + 7;
                                    j14 = j13 ^ (((long) bArr[i14]) << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i14 = i11 + 8;
                                        j13 = j14 ^ (((long) bArr[i15]) << 49);
                                        if (j13 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i15 = i11 + 9;
                                            long j15 = (j13 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                            if (j15 >= 0) {
                                                j9 = j15;
                                                i14 = i15;
                                                this.bufferPos = i14;
                                                return j9;
                                            }
                                            i14 = i11 + 10;
                                            if (bArr[i15] >= 0) {
                                                j9 = j15;
                                                this.bufferPos = i14;
                                                return j9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j9 = j14 ^ j12;
                    i14 = i15;
                    this.bufferPos = i14;
                    return j9;
                }
                j11 = -128;
                j9 = j13 ^ j11;
                this.bufferPos = i14;
                return j9;
            }
        }
        return readRawVarint64SlowPath();
    }

    public long readRawVarint64SlowPath() throws IOException {
        long j9 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            byte rawByte = readRawByte();
            j9 |= ((long) (rawByte & ByteCompanionObject.MAX_VALUE)) << i11;
            if ((rawByte & ByteCompanionObject.MIN_VALUE) == 0) {
                return j9;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i11 = this.bufferSize;
        int i12 = this.bufferPos;
        if (rawVarint32 > i11 - i12 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? "" : new String(readRawBytesSlowPath(rawVarint32), ArticleContentView.UTF_8_ENCODING_TYPE);
        }
        String str = new String(this.buffer, i12, rawVarint32, ArticleContentView.UTF_8_ENCODING_TYPE);
        this.bufferPos += rawVarint32;
        return str;
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] rawBytesSlowPath;
        int rawVarint32 = readRawVarint32();
        int i11 = this.bufferPos;
        if (rawVarint32 <= this.bufferSize - i11 && rawVarint32 > 0) {
            rawBytesSlowPath = this.buffer;
            this.bufferPos = i11 + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            rawBytesSlowPath = readRawBytesSlowPath(rawVarint32);
            i11 = 0;
        }
        if (Utf8.isValidUtf8(rawBytesSlowPath, i11, i11 + rawVarint32)) {
            return new String(rawBytesSlowPath, i11, rawVarint32, ArticleContentView.UTF_8_ENCODING_TYPE);
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.lastTag = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.lastTag;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public boolean skipField(int i11, CodedOutputStream codedOutputStream) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i11);
        if (tagWireType == 0) {
            long int64 = readInt64();
            codedOutputStream.writeRawVarint32(i11);
            codedOutputStream.writeUInt64NoTag(int64);
            return true;
        }
        if (tagWireType == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i11);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            ByteString bytes = readBytes();
            codedOutputStream.writeRawVarint32(i11);
            codedOutputStream.writeBytesNoTag(bytes);
            return true;
        }
        if (tagWireType == 3) {
            codedOutputStream.writeRawVarint32(i11);
            skipMessage(codedOutputStream);
            int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i11), 4);
            checkLastTagWas(iMakeTag);
            codedOutputStream.writeRawVarint32(iMakeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int rawLittleEndian32 = readRawLittleEndian32();
        codedOutputStream.writeRawVarint32(i11);
        codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
        return true;
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag, codedOutputStream));
    }

    public void skipRawBytes(int i11) throws IOException {
        int i12 = this.bufferSize;
        int i13 = this.bufferPos;
        if (i11 > i12 - i13 || i11 < 0) {
            skipRawBytesSlowPath(i11);
        } else {
            this.bufferPos = i13 + i11;
        }
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(iPushLimit);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    private CodedInputStream(InputStream inputStream) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = new byte[4096];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
        this.bufferIsImmutable = false;
    }

    public static int readRawVarint32(int i11, InputStream inputStream) throws IOException {
        if ((i11 & 128) == 0) {
            return i11;
        }
        int i12 = i11 & 127;
        int i13 = 7;
        while (i13 < 32) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i12 |= (i14 & 127) << i13;
            if ((i14 & 128) == 0) {
                return i12;
            }
            i13 += 7;
        }
        while (i13 < 64) {
            int i15 = inputStream.read();
            if (i15 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i15 & 128) == 0) {
                return i12;
            }
            i13 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }
}
