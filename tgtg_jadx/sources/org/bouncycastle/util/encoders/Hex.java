package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class Hex {
    private static final HexEncoder encoder = new HexEncoder();

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new DecoderException(k.j(e5, new StringBuilder("exception decoding Hex data: ")), e5);
        }
    }

    public static byte[] decodeStrict(String str) {
        try {
            return encoder.decodeStrict(str, 0, str.length());
        } catch (Exception e5) {
            throw new DecoderException(k.j(e5, new StringBuilder("exception decoding Hex string: ")), e5);
        }
    }

    public static byte[] encode(byte[] bArr, int i11, int i12) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.encode(bArr, i11, i12, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new EncoderException(k.j(e5, new StringBuilder("exception encoding Hex string: ")), e5);
        }
    }

    public static String toHexString(byte[] bArr, int i11, int i12) {
        return Strings.fromByteArray(encode(bArr, i11, i12));
    }

    public static String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length);
    }

    public static byte[] decodeStrict(String str, int i11, int i12) {
        try {
            return encoder.decodeStrict(str, i11, i12);
        } catch (Exception e5) {
            throw new DecoderException(k.j(e5, new StringBuilder("exception decoding Hex string: ")), e5);
        }
    }

    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new DecoderException(k.j(e5, new StringBuilder("exception decoding Hex string: ")), e5);
        }
    }

    public static int encode(byte[] bArr, int i11, int i12, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, i11, i12, outputStream);
    }

    public static int decode(String str, OutputStream outputStream) throws IOException {
        return encoder.decode(str, outputStream);
    }
}
