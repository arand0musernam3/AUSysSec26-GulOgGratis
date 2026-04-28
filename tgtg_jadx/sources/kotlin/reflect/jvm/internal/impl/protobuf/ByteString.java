package kotlin.reflect.jvm.internal.impl.protobuf;

import a40.d0;
import i4.a;
import j4.d;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ByteString implements Iterable<Byte> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ByteString EMPTY = new LiteralByteString(new byte[0]);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i11) {
        if (i11 == 1) {
            return it.next();
        }
        int i12 = i11 >>> 1;
        return balancedConcat(it, i12).concat(balancedConcat(it, i11 - i12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        ?? arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList.isEmpty() ? EMPTY : balancedConcat(arrayList.iterator(), arrayList.size());
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new LiteralByteString(str.getBytes(ArticleContentView.UTF_8_ENCODING_TYPE));
        } catch (UnsupportedEncodingException e5) {
            d0.o("UTF-8 not supported?", e5);
            return null;
        }
    }

    public static Output newOutput() {
        return new Output(128);
    }

    public ByteString concat(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return RopeByteString.concatenate(this, byteString);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void copyTo(byte[] bArr, int i11, int i12, int i13) {
        if (i11 < 0) {
            d.d(30, i11, "Source offset < 0: ");
            return;
        }
        if (i12 < 0) {
            d.d(30, i12, "Target offset < 0: ");
            return;
        }
        if (i13 < 0) {
            d.d(23, i13, "Length < 0: ");
            return;
        }
        int i14 = i11 + i13;
        if (i14 > size()) {
            d.d(34, i14, "Source end offset < 0: ");
            return;
        }
        int i15 = i12 + i13;
        if (i15 > bArr.length) {
            d.d(34, i15, "Target end offset < 0: ");
        } else if (i13 > 0) {
            copyToInternal(bArr, i11, i12, i13);
        }
    }

    public abstract void copyToInternal(byte[] bArr, int i11, int i12, int i13);

    public abstract int getTreeDepth();

    public abstract boolean isBalanced();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Iterable
    public abstract Iterator<Byte> iterator();

    public abstract CodedInputStream newCodedInput();

    public abstract int partialHash(int i11, int i12, int i13);

    public abstract int partialIsValidUtf8(int i11, int i12, int i13);

    public abstract int peekCachedHashCode();

    public abstract int size();

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String toString(String str) throws UnsupportedEncodingException;

    public String toStringUtf8() {
        try {
            return toString(ArticleContentView.UTF_8_ENCODING_TYPE);
        } catch (UnsupportedEncodingException e5) {
            d0.o("UTF-8 not supported?", e5);
            return null;
        }
    }

    public void writeTo(OutputStream outputStream, int i11, int i12) throws IOException {
        if (i11 < 0) {
            d.d(30, i11, "Source offset < 0: ");
            return;
        }
        if (i12 < 0) {
            d.d(23, i12, "Length < 0: ");
            return;
        }
        int i13 = i11 + i12;
        if (i13 > size()) {
            d.d(39, i13, "Source end offset exceeded: ");
        } else if (i12 > 0) {
            writeToInternal(outputStream, i11, i12);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i11, int i12) throws IOException;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public Output(int i11) {
            if (i11 < 0) {
                a.f("Buffer size < 0");
                throw null;
            }
            this.initialCapacity = i11;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i11];
        }

        private byte[] copyArray(byte[] bArr, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i11));
            return bArr2;
        }

        private void flushFullBuffer(int i11) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i11, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i11 = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i11 >= bArr.length) {
                this.flushedBuffers.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i11 > 0) {
                this.flushedBuffers.add(new LiteralByteString(copyArray(bArr, i11)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i11, int i12) {
            try {
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i13 = this.bufferPos;
                if (i12 <= length - i13) {
                    System.arraycopy(bArr, i11, bArr2, i13, i12);
                    this.bufferPos += i12;
                } else {
                    int length2 = bArr2.length - i13;
                    System.arraycopy(bArr, i11, bArr2, i13, length2);
                    int i14 = i12 - length2;
                    flushFullBuffer(i14);
                    System.arraycopy(bArr, i11 + length2, this.buffer, 0, i14);
                    this.bufferPos = i14;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i11) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i12 = this.bufferPos;
                this.bufferPos = i12 + 1;
                bArr[i12] = (byte) i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new LiteralByteString(bArr2);
    }
}
