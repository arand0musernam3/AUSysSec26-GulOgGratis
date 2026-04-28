package org.bouncycastle.util.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Streams {
    private static int BUFFER_SIZE = 4096;

    public static void drain(InputStream inputStream) throws IOException {
        int i11 = BUFFER_SIZE;
        while (inputStream.read(new byte[i11], 0, i11) >= 0) {
        }
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        while (true) {
            int i12 = inputStream.read(bArr, 0, i11);
            if (i12 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i12);
            }
        }
    }

    public static long pipeAllLimited(InputStream inputStream, long j9, OutputStream outputStream) throws IOException {
        int i11 = BUFFER_SIZE;
        byte[] bArr = new byte[i11];
        long j11 = 0;
        while (true) {
            int i12 = inputStream.read(bArr, 0, i11);
            if (i12 < 0) {
                return j11;
            }
            long j12 = i12;
            if (j9 - j11 < j12) {
                throw new StreamOverflowException("Data Overflow");
            }
            j11 += j12;
            outputStream.write(bArr, 0, i12);
        }
    }

    public static byte[] readAll(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAll(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] readAllLimited(InputStream inputStream, int i11) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAllLimited(inputStream, i11, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int readFully(InputStream inputStream, byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        while (i13 < i12) {
            int i14 = inputStream.read(bArr, i11 + i13, i12 - i13);
            if (i14 < 0) {
                break;
            }
            i13 += i14;
        }
        return i13;
    }

    public static void validateBufferArguments(byte[] bArr, int i11, int i12) {
        Arrays.validateSegment(bArr, i11, i12);
    }

    public static void writeBufTo(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) throws IOException {
        byteArrayOutputStream.writeTo(outputStream);
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream) throws IOException {
        pipeAll(inputStream, outputStream, BUFFER_SIZE);
    }

    public static int readFully(InputStream inputStream, byte[] bArr) throws IOException {
        return readFully(inputStream, bArr, 0, bArr.length);
    }
}
