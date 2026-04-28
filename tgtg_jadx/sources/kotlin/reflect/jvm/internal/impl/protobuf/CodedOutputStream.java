package kotlin.reflect.jvm.internal.impl.protobuf;

import a40.d0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class CodedOutputStream {
    private final byte[] buffer;
    private final int limit;
    private final OutputStream output;
    private int totalBytesWritten = 0;
    private int position = 0;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.output = outputStream;
        this.buffer = bArr;
        this.limit = bArr.length;
    }

    public static int computeBoolSize(int i11, boolean z11) {
        return computeBoolSizeNoTag(z11) + computeTagSize(i11);
    }

    public static int computeBoolSizeNoTag(boolean z11) {
        return 1;
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeBytesSize(int i11, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i11);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return byteString.size() + computeRawVarint32Size(byteString.size());
    }

    public static int computeDoubleSize(int i11, double d3) {
        return computeDoubleSizeNoTag(d3) + computeTagSize(i11);
    }

    public static int computeDoubleSizeNoTag(double d3) {
        return 8;
    }

    public static int computeEnumSize(int i11, int i12) {
        return computeEnumSizeNoTag(i12) + computeTagSize(i11);
    }

    public static int computeEnumSizeNoTag(int i11) {
        return computeInt32SizeNoTag(i11);
    }

    public static int computeFixed32SizeNoTag(int i11) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j9) {
        return 8;
    }

    public static int computeFloatSize(int i11, float f11) {
        return computeFloatSizeNoTag(f11) + computeTagSize(i11);
    }

    public static int computeFloatSizeNoTag(float f11) {
        return 4;
    }

    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i11, int i12) {
        return computeInt32SizeNoTag(i12) + computeTagSize(i11);
    }

    public static int computeInt32SizeNoTag(int i11) {
        if (i11 >= 0) {
            return computeRawVarint32Size(i11);
        }
        return 10;
    }

    public static int computeInt64SizeNoTag(long j9) {
        return computeRawVarint64Size(j9);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        int serializedSize = lazyFieldLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeMessageSize(int i11, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i11);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computePreferredBufferSize(int i11) {
        if (i11 > 4096) {
            return 4096;
        }
        return i11;
    }

    public static int computeRawVarint32Size(int i11) {
        if ((i11 & (-128)) == 0) {
            return 1;
        }
        if ((i11 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i11) == 0) {
            return 3;
        }
        return (i11 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j9) {
        if (((-128) & j9) == 0) {
            return 1;
        }
        if (((-16384) & j9) == 0) {
            return 2;
        }
        if (((-2097152) & j9) == 0) {
            return 3;
        }
        if (((-268435456) & j9) == 0) {
            return 4;
        }
        if (((-34359738368L) & j9) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j9) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j9) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j9) == 0) {
            return 8;
        }
        return (j9 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32SizeNoTag(int i11) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j9) {
        return 8;
    }

    public static int computeSInt32SizeNoTag(int i11) {
        return computeRawVarint32Size(encodeZigZag32(i11));
    }

    public static int computeSInt64Size(int i11, long j9) {
        return computeSInt64SizeNoTag(j9) + computeTagSize(i11);
    }

    public static int computeSInt64SizeNoTag(long j9) {
        return computeRawVarint64Size(encodeZigZag64(j9));
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            byte[] bytes = str.getBytes(ArticleContentView.UTF_8_ENCODING_TYPE);
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e5) {
            d0.o("UTF-8 not supported.", e5);
            return 0;
        }
    }

    public static int computeTagSize(int i11) {
        return computeRawVarint32Size(WireFormat.makeTag(i11, 0));
    }

    public static int computeUInt32SizeNoTag(int i11) {
        return computeRawVarint32Size(i11);
    }

    public static int computeUInt64SizeNoTag(long j9) {
        return computeRawVarint64Size(j9);
    }

    public static int encodeZigZag32(int i11) {
        return (i11 >> 31) ^ (i11 << 1);
    }

    public static long encodeZigZag64(long j9) {
        return (j9 >> 63) ^ (j9 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i11) {
        return new CodedOutputStream(outputStream, new byte[i11]);
    }

    private void refreshBuffer() throws IOException {
        OutputStream outputStream = this.output;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    public void flush() throws IOException {
        if (this.output != null) {
            refreshBuffer();
        }
    }

    public void writeBool(int i11, boolean z11) throws IOException {
        writeTag(i11, 0);
        writeBoolNoTag(z11);
    }

    public void writeBoolNoTag(boolean z11) throws IOException {
        writeRawByte(z11 ? 1 : 0);
    }

    public void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeBytes(int i11, ByteString byteString) throws IOException {
        writeTag(i11, 2);
        writeBytesNoTag(byteString);
    }

    public void writeBytesNoTag(ByteString byteString) throws IOException {
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
    }

    public void writeDouble(int i11, double d3) throws IOException {
        writeTag(i11, 1);
        writeDoubleNoTag(d3);
    }

    public void writeDoubleNoTag(double d3) throws IOException {
        writeRawLittleEndian64(Double.doubleToRawLongBits(d3));
    }

    public void writeEnum(int i11, int i12) throws IOException {
        writeTag(i11, 0);
        writeEnumNoTag(i12);
    }

    public void writeEnumNoTag(int i11) throws IOException {
        writeInt32NoTag(i11);
    }

    public void writeFixed32NoTag(int i11) throws IOException {
        writeRawLittleEndian32(i11);
    }

    public void writeFixed64NoTag(long j9) throws IOException {
        writeRawLittleEndian64(j9);
    }

    public void writeFloat(int i11, float f11) throws IOException {
        writeTag(i11, 5);
        writeFloatNoTag(f11);
    }

    public void writeFloatNoTag(float f11) throws IOException {
        writeRawLittleEndian32(Float.floatToRawIntBits(f11));
    }

    public void writeGroup(int i11, MessageLite messageLite) throws IOException {
        writeTag(i11, 3);
        writeGroupNoTag(messageLite);
        writeTag(i11, 4);
    }

    public void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public void writeInt32(int i11, int i12) throws IOException {
        writeTag(i11, 0);
        writeInt32NoTag(i12);
    }

    public void writeInt32NoTag(int i11) throws IOException {
        if (i11 >= 0) {
            writeRawVarint32(i11);
        } else {
            writeRawVarint64(i11);
        }
    }

    public void writeInt64NoTag(long j9) throws IOException {
        writeRawVarint64(j9);
    }

    public void writeMessage(int i11, MessageLite messageLite) throws IOException {
        writeTag(i11, 2);
        writeMessageNoTag(messageLite);
    }

    public void writeMessageNoTag(MessageLite messageLite) throws IOException {
        writeRawVarint32(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    public void writeMessageSetExtension(int i11, MessageLite messageLite) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i11);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    public void writeRawByte(byte b8) throws IOException {
        if (this.position == this.limit) {
            refreshBuffer();
        }
        byte[] bArr = this.buffer;
        int i11 = this.position;
        this.position = i11 + 1;
        bArr[i11] = b8;
        this.totalBytesWritten++;
    }

    public void writeRawBytes(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.limit;
        int i14 = this.position;
        int i15 = i13 - i14;
        byte[] bArr2 = this.buffer;
        if (i15 >= i12) {
            System.arraycopy(bArr, i11, bArr2, i14, i12);
            this.position += i12;
            this.totalBytesWritten += i12;
            return;
        }
        int i16 = i13 - i14;
        System.arraycopy(bArr, i11, bArr2, i14, i16);
        int i17 = i11 + i16;
        int i18 = i12 - i16;
        this.position = this.limit;
        this.totalBytesWritten += i16;
        refreshBuffer();
        if (i18 <= this.limit) {
            System.arraycopy(bArr, i17, this.buffer, 0, i18);
            this.position = i18;
        } else {
            this.output.write(bArr, i17, i18);
        }
        this.totalBytesWritten += i18;
    }

    public void writeRawLittleEndian32(int i11) throws IOException {
        writeRawByte(i11 & 255);
        writeRawByte((i11 >> 8) & 255);
        writeRawByte((i11 >> 16) & 255);
        writeRawByte((i11 >> 24) & 255);
    }

    public void writeRawLittleEndian64(long j9) throws IOException {
        writeRawByte(((int) j9) & 255);
        writeRawByte(((int) (j9 >> 8)) & 255);
        writeRawByte(((int) (j9 >> 16)) & 255);
        writeRawByte(((int) (j9 >> 24)) & 255);
        writeRawByte(((int) (j9 >> 32)) & 255);
        writeRawByte(((int) (j9 >> 40)) & 255);
        writeRawByte(((int) (j9 >> 48)) & 255);
        writeRawByte(((int) (j9 >> 56)) & 255);
    }

    public void writeRawVarint32(int i11) throws IOException {
        while ((i11 & (-128)) != 0) {
            writeRawByte((i11 & 127) | 128);
            i11 >>>= 7;
        }
        writeRawByte(i11);
    }

    public void writeRawVarint64(long j9) throws IOException {
        while (((-128) & j9) != 0) {
            writeRawByte((((int) j9) & 127) | 128);
            j9 >>>= 7;
        }
        writeRawByte((int) j9);
    }

    public void writeSFixed32NoTag(int i11) throws IOException {
        writeRawLittleEndian32(i11);
    }

    public void writeSFixed64NoTag(long j9) throws IOException {
        writeRawLittleEndian64(j9);
    }

    public void writeSInt32NoTag(int i11) throws IOException {
        writeRawVarint32(encodeZigZag32(i11));
    }

    public void writeSInt64(int i11, long j9) throws IOException {
        writeTag(i11, 0);
        writeSInt64NoTag(j9);
    }

    public void writeSInt64NoTag(long j9) throws IOException {
        writeRawVarint64(encodeZigZag64(j9));
    }

    public void writeStringNoTag(String str) throws IOException {
        byte[] bytes = str.getBytes(ArticleContentView.UTF_8_ENCODING_TYPE);
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public void writeTag(int i11, int i12) throws IOException {
        writeRawVarint32(WireFormat.makeTag(i11, i12));
    }

    public void writeUInt32(int i11, int i12) throws IOException {
        writeTag(i11, 0);
        writeUInt32NoTag(i12);
    }

    public void writeUInt32NoTag(int i11) throws IOException {
        writeRawVarint32(i11);
    }

    public void writeUInt64NoTag(long j9) throws IOException {
        writeRawVarint64(j9);
    }

    public void writeRawByte(int i11) throws IOException {
        writeRawByte((byte) i11);
    }

    public void writeRawBytes(byte[] bArr) throws IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawBytes(ByteString byteString) throws IOException {
        writeRawBytes(byteString, 0, byteString.size());
    }

    public void writeRawBytes(ByteString byteString, int i11, int i12) throws IOException {
        int i13 = this.limit;
        int i14 = this.position;
        int i15 = i13 - i14;
        byte[] bArr = this.buffer;
        if (i15 >= i12) {
            byteString.copyTo(bArr, i11, i14, i12);
            this.position += i12;
            this.totalBytesWritten += i12;
            return;
        }
        int i16 = i13 - i14;
        byteString.copyTo(bArr, i11, i14, i16);
        int i17 = i11 + i16;
        int i18 = i12 - i16;
        this.position = this.limit;
        this.totalBytesWritten += i16;
        refreshBuffer();
        if (i18 <= this.limit) {
            byteString.copyTo(this.buffer, i17, 0, i18);
            this.position = i18;
        } else {
            byteString.writeTo(this.output, i17, i18);
        }
        this.totalBytesWritten += i18;
    }
}
