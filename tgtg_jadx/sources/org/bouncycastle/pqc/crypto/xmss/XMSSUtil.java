package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import com.braze.h2;
import i4.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class XMSSUtil {

    public static class CheckingStream extends ObjectInputStream {
        private static final Set components;
        private boolean found;
        private final Class mainClass;

        static {
            HashSet hashSet = new HashSet();
            components = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        public CheckingStream(Class cls, InputStream inputStream) throws IOException {
            super(inputStream);
            this.found = false;
            this.mainClass = cls;
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            if (this.found) {
                if (!components.contains(objectStreamClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else {
                if (!objectStreamClass.getName().equals(this.mainClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
                this.found = true;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static boolean areEqual(byte[][] bArr, byte[][] bArr2) {
        if (hasNullPointer(bArr) || hasNullPointer(bArr2)) {
            w.l("a or b == null");
            return false;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (!Arrays.areEqual(bArr[i11], bArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static long bytesToXBigEndian(byte[] bArr, int i11, int i12) {
        if (bArr == null) {
            w.l("in == null");
            return 0L;
        }
        long j9 = 0;
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            j9 = (j9 << 8) | ((long) (bArr[i13] & 255));
        }
        return j9;
    }

    public static int calculateTau(int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (((i11 >> i13) & 1) == 0) {
                return i13;
            }
        }
        return 0;
    }

    public static byte[][] cloneArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            w.l("in has null pointers");
            return null;
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte[] bArr3 = new byte[bArr[i11].length];
            bArr2[i11] = bArr3;
            byte[] bArr4 = bArr[i11];
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        return bArr2;
    }

    public static void copyBytesAtOffset(byte[] bArr, byte[] bArr2, int i11) {
        if (bArr == null) {
            w.l("dst == null");
            return;
        }
        if (bArr2 == null) {
            w.l("src == null");
            return;
        }
        if (i11 < 0) {
            a.f("offset hast to be >= 0");
            return;
        }
        if (bArr2.length + i11 > bArr.length) {
            a.f("src length + offset must not be greater than size of destination");
            return;
        }
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            bArr[i11 + i12] = bArr2[i12];
        }
    }

    public static Object deserialize(byte[] bArr, Class cls) throws ClassNotFoundException, IOException {
        String str;
        CheckingStream checkingStream = new CheckingStream(cls, new ByteArrayInputStream(bArr));
        Object object = checkingStream.readObject();
        if (checkingStream.available() != 0) {
            str = "unexpected data found at end of ObjectInputStream";
        } else {
            if (cls.isInstance(object)) {
                return object;
            }
            str = "unexpected class found in ObjectInputStream";
        }
        a.k(str);
        return null;
    }

    public static void dumpByteArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            w.l("x has null pointers");
            return;
        }
        for (byte[] bArr2 : bArr) {
            System.out.println(Hex.toHexString(bArr2));
        }
    }

    public static byte[] extractBytesAtOffset(byte[] bArr, int i11, int i12) {
        String str;
        if (bArr == null) {
            w.l("src == null");
            return null;
        }
        if (i11 < 0) {
            str = "offset hast to be >= 0";
        } else if (i12 < 0) {
            str = "length hast to be >= 0";
        } else {
            if (i11 + i12 <= bArr.length) {
                byte[] bArr2 = new byte[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    bArr2[i13] = bArr[i11 + i13];
                }
                return bArr2;
            }
            str = "offset + length must not be greater then size of source array";
        }
        a.f(str);
        return null;
    }

    public static int getDigestSize(Digest digest) {
        if (digest == null) {
            w.l("digest == null");
            return 0;
        }
        String algorithmName = digest.getAlgorithmName();
        if (algorithmName.equals("SHAKE128")) {
            return 32;
        }
        if (algorithmName.equals("SHAKE256")) {
            return 64;
        }
        return digest.getDigestSize();
    }

    public static int getLeafIndex(long j9, int i11) {
        return (int) (j9 & ((1 << i11) - 1));
    }

    public static long getTreeIndex(long j9, int i11) {
        return j9 >> i11;
    }

    public static boolean hasNullPointer(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isIndexValid(int i11, long j9) {
        if (j9 >= 0) {
            return j9 < (1 << i11);
        }
        h2.b("index must not be negative");
        return false;
    }

    public static boolean isNewAuthenticationPathNeeded(long j9, int i11, int i12) {
        return j9 != 0 && (j9 + 1) % ((long) Math.pow((double) (1 << i11), (double) i12)) == 0;
    }

    public static boolean isNewBDSInitNeeded(long j9, int i11, int i12) {
        return j9 != 0 && j9 % ((long) Math.pow((double) (1 << i11), (double) (i12 + 1))) == 0;
    }

    public static int log2(int i11) {
        int i12 = 0;
        while (true) {
            i11 >>= 1;
            if (i11 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public static void longToBigEndian(long j9, byte[] bArr, int i11) {
        if (bArr == null) {
            w.l("in == null");
            return;
        }
        if (bArr.length - i11 < 8) {
            a.f("not enough space in array");
            return;
        }
        bArr[i11] = (byte) ((j9 >> 56) & 255);
        bArr[i11 + 1] = (byte) ((j9 >> 48) & 255);
        bArr[i11 + 2] = (byte) ((j9 >> 40) & 255);
        bArr[i11 + 3] = (byte) ((j9 >> 32) & 255);
        bArr[i11 + 4] = (byte) ((j9 >> 24) & 255);
        bArr[i11 + 5] = (byte) ((j9 >> 16) & 255);
        bArr[i11 + 6] = (byte) ((j9 >> 8) & 255);
        bArr[i11 + 7] = (byte) (j9 & 255);
    }

    public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] toBytesBigEndian(long j9, int i11) {
        byte[] bArr = new byte[i11];
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            bArr[i12] = (byte) j9;
            j9 >>>= 8;
        }
        return bArr;
    }

    public static byte[] cloneArray(byte[] bArr) {
        if (bArr == null) {
            w.l("in == null");
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
