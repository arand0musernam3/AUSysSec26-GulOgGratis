package org.bouncycastle.util;

import com.braze.h2;
import i4.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Vector;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: loaded from: classes3.dex */
public final class Strings {
    private static String LINE_SEPARATOR;

    static {
        try {
            try {
                LINE_SEPARATOR = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.bouncycastle.util.Strings.1
                    @Override // java.security.PrivilegedAction
                    public String run() {
                        return System.getProperty("line.separator");
                    }
                });
            } catch (Exception unused) {
                LINE_SEPARATOR = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            LINE_SEPARATOR = "\n";
        }
    }

    public static char[] asCharArray(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i11 = 0; i11 != length; i11++) {
            cArr[i11] = (char) (bArr[i11] & 255);
        }
        return cArr;
    }

    public static boolean constantTimeAreEqual(String str, String str2) {
        boolean z11 = str.length() == str2.length();
        int length = str.length();
        if (z11) {
            for (int i11 = 0; i11 != length; i11++) {
                z11 &= str.charAt(i11) == str2.charAt(i11);
            }
            return z11;
        }
        for (int i12 = 0; i12 != length; i12++) {
            z11 &= str.charAt(i12) == ' ';
        }
        return z11;
    }

    public static String fromByteArray(byte[] bArr) {
        return new String(asCharArray(bArr));
    }

    public static String fromUTF8ByteArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int iTranscodeToUTF16 = UTF8.transcodeToUTF16(bArr, cArr);
        if (iTranscodeToUTF16 >= 0) {
            return new String(cArr, 0, iTranscodeToUTF16);
        }
        a.f("Invalid UTF-8 input");
        return null;
    }

    public static String lineSeparator() {
        return LINE_SEPARATOR;
    }

    public static StringList newList() {
        return new StringListImpl();
    }

    public static String[] split(String str, char c3) {
        int i11;
        Vector vector = new Vector();
        boolean z11 = true;
        while (true) {
            if (!z11) {
                break;
            }
            int iIndexOf = str.indexOf(c3);
            if (iIndexOf > 0) {
                vector.addElement(str.substring(0, iIndexOf));
                str = str.substring(iIndexOf + 1);
            } else {
                vector.addElement(str);
                z11 = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i11 = 0; i11 != size; i11++) {
            strArr[i11] = (String) vector.elementAt(i11);
        }
        return strArr;
    }

    public static int toByteArray(String str, byte[] bArr, int i11) {
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            bArr[i11 + i12] = (byte) str.charAt(i12);
        }
        return length;
    }

    public static String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z11 = false;
        for (int i11 = 0; i11 != charArray.length; i11++) {
            char c3 = charArray[i11];
            if ('A' <= c3 && 'Z' >= c3) {
                charArray[i11] = (char) (c3 + ' ');
                z11 = true;
            }
        }
        return z11 ? new String(charArray) : str;
    }

    public static void toUTF8ByteArray(char[] cArr, OutputStream outputStream) throws IOException {
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < cArr.length) {
            char c3 = cArr[i13];
            int i14 = c3;
            if (c3 >= 128) {
                if (c3 < 2048) {
                    i11 = (c3 >> 6) | BERTags.PRIVATE;
                } else if (c3 < 55296 || c3 > 57343) {
                    outputStream.write((c3 >> '\f') | BERTags.FLAGS);
                    i11 = ((c3 >> 6) & 63) | 128;
                } else {
                    i13++;
                    if (i13 >= cArr.length) {
                        h2.b("invalid UTF-16 codepoint");
                        return;
                    }
                    char c7 = cArr[i13];
                    if (c3 > 56319) {
                        h2.b("invalid UTF-16 codepoint");
                        return;
                    }
                    int i15 = (((c3 & 1023) << 10) | (c7 & 1023)) + 65536;
                    outputStream.write((i15 >> 18) | 240);
                    outputStream.write(((i15 >> 12) & 63) | 128);
                    outputStream.write(((i15 >> 6) & 63) | 128);
                    i12 = i15;
                    i14 = (i12 & 63) | 128;
                }
                outputStream.write(i11);
                i12 = c3;
                i14 = (i12 & 63) | 128;
            }
            outputStream.write(i14);
            i13++;
        }
    }

    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z11 = false;
        for (int i11 = 0; i11 != charArray.length; i11++) {
            char c3 = charArray[i11];
            if ('a' <= c3 && 'z' >= c3) {
                charArray[i11] = (char) (c3 - ' ');
                z11 = true;
            }
        }
        return z11 ? new String(charArray) : str;
    }

    public static class StringListImpl extends ArrayList<String> implements StringList {
        private StringListImpl() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List, org.bouncycastle.util.StringList
        public /* bridge */ /* synthetic */ String get(int i11) {
            return (String) super.get(i11);
        }

        @Override // org.bouncycastle.util.StringList
        public String[] toStringArray(int i11, int i12) {
            String[] strArr = new String[i12 - i11];
            for (int i13 = i11; i13 != size() && i13 != i12; i13++) {
                strArr[i13 - i11] = get(i13);
            }
            return strArr;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public void add(int i11, String str) {
            super.add(i11, str);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public String set(int i11, String str) {
            return (String) super.set(i11, str);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(String str) {
            return super.add(str);
        }

        @Override // org.bouncycastle.util.StringList
        public String[] toStringArray() {
            int size = size();
            String[] strArr = new String[size];
            for (int i11 = 0; i11 != size; i11++) {
                strArr[i11] = get(i11);
            }
            return strArr;
        }
    }

    public static byte[] toByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 != length; i11++) {
            bArr[i11] = (byte) str.charAt(i11);
        }
        return bArr;
    }

    public static byte[] toByteArray(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 != length; i11++) {
            bArr[i11] = (byte) cArr[i11];
        }
        return bArr;
    }

    public static String fromUTF8ByteArray(byte[] bArr, int i11, int i12) {
        char[] cArr = new char[i12];
        int iTranscodeToUTF16 = UTF8.transcodeToUTF16(bArr, i11, i12, cArr);
        if (iTranscodeToUTF16 >= 0) {
            return new String(cArr, 0, iTranscodeToUTF16);
        }
        a.f("Invalid UTF-8 input");
        return null;
    }

    public static byte[] toUTF8ByteArray(String str) {
        return toUTF8ByteArray(str.toCharArray());
    }

    public static byte[] toUTF8ByteArray(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            h2.b("cannot encode string to byte array!");
            return null;
        }
    }
}
