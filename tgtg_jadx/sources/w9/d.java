package w9;

import android.content.pm.PackageInfo;
import com.braze.h2;
import j4.s;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l50.a f43308a = new l50.a(23);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f43309b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f43310c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f43311d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f43312e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f43313f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f43314g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f43315h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f43316i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f43317j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    public static byte[] b(a[] aVarArr, byte[] bArr) throws IOException {
        int i11 = 0;
        int length = 0;
        for (a aVar : aVarArr) {
            length += ((((aVar.f43305g * 2) + 7) & (-8)) / 8) + (aVar.f43303e * 2) + d(bArr, aVar.f43299a, aVar.f43300b).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f43304f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f43313f)) {
            int length2 = aVarArr.length;
            while (i11 < length2) {
                a aVar2 = aVarArr[i11];
                q(byteArrayOutputStream, aVar2, d(bArr, aVar2.f43299a, aVar2.f43300b));
                p(byteArrayOutputStream, aVar2);
                i11++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                q(byteArrayOutputStream, aVar3, d(bArr, aVar3.f43299a, aVar3.f43300b));
            }
            int length3 = aVarArr.length;
            while (i11 < length3) {
                p(byteArrayOutputStream, aVarArr[i11]);
                i11++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z11 = true;
        for (File file2 : fileArrListFiles) {
            z11 = c(file2) && z11;
        }
        return z11;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f43315h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f43314g;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return k.p(b3.i.o(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i12, i11 - i12);
            if (i13 < 0) {
                h2.b(s.f(i11, "Not enough bytes to read: "));
                return null;
            }
            i12 += i13;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i11) {
        int[] iArr = new int[i11];
        int iM = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i12] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i11, int i12) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i12];
            byte[] bArr2 = new byte[NewHope.SENDB_BYTES];
            int i13 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i13 < i11) {
                int i14 = fileInputStream.read(bArr2);
                if (i14 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i11 + " bytes");
                }
                inflater.setInput(bArr2, 0, i14);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i12 - iInflate);
                    i13 += i14;
                } catch (DataFormatException e5) {
                    throw new IllegalStateException(e5.getMessage());
                }
            }
            if (i13 == i11) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i11 + " actual=" + i13);
        } finally {
            inflater.end();
        }
    }

    public static a[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) throws IOException {
        byte[] bArr3 = f43316i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f43317j)) {
                h2.b("Unsupported meta version");
                return null;
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                h2.b("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                a[] aVarArrK = k(byteArrayInputStream, bArr2, iM, aVarArr);
                byteArrayInputStream.close();
                return aVarArrK;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(f43311d, bArr2)) {
            h2.b("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            h2.b("Unsupported meta version");
            return null;
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            h2.b("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            a[] aVarArrJ = j(byteArrayInputStream2, iM2, aVarArr);
            byteArrayInputStream2.close();
            return aVarArrJ;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream, int i11, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i11 != aVarArr.length) {
            h2.b("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i11];
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i12] = (int) m(byteArrayInputStream, 2);
            strArr[i12] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            a aVar = aVarArr[i13];
            if (!aVar.f43300b.equals(strArr[i13])) {
                h2.b("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i14 = iArr[i13];
            aVar.f43303e = i14;
            aVar.f43306h = g(byteArrayInputStream, i14);
        }
        return aVarArr;
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i11, a[] aVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i11 != aVarArr.length) {
            h2.b("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            a aVar = null;
            if (aVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i13 = 0;
                while (true) {
                    if (i13 >= aVarArr.length) {
                        break;
                    }
                    if (aVarArr[i13].f43300b.equals(strSubstring)) {
                        aVar = aVarArr[i13];
                        break;
                    }
                    i13++;
                }
            }
            if (aVar == null) {
                h2.b("Missing profile key: ".concat(str));
                return null;
            }
            aVar.f43302d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f43315h)) {
                aVar.f43303e = iM;
                aVar.f43306h = iArrG;
            }
        }
        return aVarArr;
    }

    public static a[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f43312e)) {
            h2.b("Unsupported version");
            return null;
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            h2.b("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            a[] aVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return aVarArrN;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long m(InputStream inputStream, int i11) throws IOException {
        byte[] bArrF = f(inputStream, i11);
        long j9 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j9 += ((long) (bArrF[i12] & 255)) << (i12 * 8);
        }
        return j9;
    }

    public static a[] n(ByteArrayInputStream byteArrayInputStream, String str, int i11) throws IOException {
        int i12 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            aVarArr[i13] = new a(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        int i14 = 0;
        while (i14 < i11) {
            a aVar = aVarArr[i14];
            int iAvailable = byteArrayInputStream.available();
            int i15 = aVar.f43304f;
            int i16 = aVar.f43305g;
            TreeMap treeMap = aVar.f43307i;
            int i17 = iAvailable - i15;
            int iM3 = i12;
            while (byteArrayInputStream.available() > i17) {
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                int iM4 = (int) m(byteArrayInputStream, 2);
                while (iM4 > 0) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            int i18 = i12;
                            int i19 = i14;
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                            i12 = i18;
                            i14 = i19;
                        }
                    }
                    iM4--;
                    i12 = i12;
                    i14 = i14;
                }
            }
            int i21 = i12;
            int i22 = i14;
            if (byteArrayInputStream.available() != i17) {
                h2.b("Read too much data during profile line parse");
                return null;
            }
            aVar.f43306h = g(byteArrayInputStream, aVar.f43303e);
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i16 * 2) + 7) & (-8)) / 8));
            for (int i23 = i21; i23 < i16; i23++) {
                int i24 = bitSetValueOf.get(i23) ? 2 : i21;
                if (bitSetValueOf.get(i23 + i16)) {
                    i24 |= 4;
                }
                if (i24 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i23));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i21);
                    }
                    treeMap.put(Integer.valueOf(i23), Integer.valueOf(i24 | numValueOf.intValue()));
                }
            }
            i14 = i22 + 1;
            i12 = i21;
        }
        return aVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f43311d;
        int i11 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f43312e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(aVarArr, bArr3);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f43314g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, aVarArr.length, 1);
                for (a aVar : aVarArr) {
                    int size = aVar.f43307i.size() * 4;
                    String strD = d(bArr4, aVar.f43299a, aVar.f43300b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, aVar.f43306h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, aVar.f43301c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = aVar.f43307i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i12 : aVar.f43306h) {
                        v(byteArrayOutputStream, i12);
                    }
                }
                return true;
            }
            byte[] bArr5 = f43313f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(aVarArr, bArr5);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f43315h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, aVarArr.length);
            for (a aVar2 : aVarArr) {
                String str = aVar2.f43299a;
                TreeMap treeMap = aVar2.f43307i;
                String strD2 = d(bArr6, str, aVar2.f43300b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, aVar2.f43306h.length);
                u(byteArrayOutputStream, aVar2.f43301c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i13 : aVar2.f43306h) {
                    v(byteArrayOutputStream, i13);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, aVarArr.length);
            int i14 = 2;
            int i15 = 2;
            for (a aVar3 : aVarArr) {
                u(byteArrayOutputStream2, aVar3.f43301c, 4);
                u(byteArrayOutputStream2, aVar3.f43302d, 4);
                u(byteArrayOutputStream2, aVar3.f43305g, 4);
                String strD3 = d(bArr2, aVar3.f43299a, aVar3.f43300b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i15 = i15 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i15 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray.length);
            }
            i iVar = new i(b.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(iVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i16 = 0;
            for (int i17 = 0; i17 < aVarArr.length; i17++) {
                try {
                    a aVar4 = aVarArr[i17];
                    v(byteArrayOutputStream3, i17);
                    v(byteArrayOutputStream3, aVar4.f43303e);
                    i16 = i16 + 4 + (aVar4.f43303e * i14);
                    int[] iArr = aVar4.f43306h;
                    int length3 = iArr.length;
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < length3) {
                        int i21 = iArr[i18];
                        v(byteArrayOutputStream3, i21 - i19);
                        i18++;
                        i14 = i14;
                        i19 = i21;
                    }
                } catch (Throwable th2) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            i iVar2 = new i(b.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i22 = 0;
            int i23 = 0;
            while (i22 < aVarArr.length) {
                try {
                    a aVar5 = aVarArr[i22];
                    Iterator it3 = aVar5.f43307i.entrySet().iterator();
                    int iIntValue = i11;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, iIntValue, aVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, aVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i22);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i24 = i23 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i23 = i24 + length4;
                            i22++;
                            arrayList3 = arrayList4;
                            i11 = 0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i23 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i23 + ", does not match actual size " + byteArray5.length);
            }
            i iVar3 = new i(b.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar3);
            long j9 = 4;
            long size2 = j9 + j9 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i25 = 0;
            while (i25 < arrayList2.size()) {
                i iVar4 = (i) arrayList2.get(i25);
                b bVar = iVar4.f43325a;
                byte[] bArr7 = iVar4.f43326b;
                u(byteArrayOutputStream, bVar.a(), 4);
                u(byteArrayOutputStream, size2, 4);
                if (iVar4.f43327c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i25++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
            }
            return true;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        s(byteArrayOutputStream, aVar);
        int i11 = aVar.f43305g;
        int[] iArr = aVar.f43306h;
        int length = iArr.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int i14 = iArr[i12];
            v(byteArrayOutputStream, i14 - i13);
            i12++;
            i13 = i14;
        }
        byte[] bArr = new byte[(((i11 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f43307i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i15 = iIntValue / 8;
                bArr[i15] = (byte) (bArr[i15] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i16 = iIntValue + i11;
                int i17 = i16 / 8;
                bArr[i17] = (byte) ((1 << (i16 % 8)) | bArr[i17]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, aVar.f43303e);
        u(byteArrayOutputStream, aVar.f43304f, 4);
        u(byteArrayOutputStream, aVar.f43301c, 4);
        u(byteArrayOutputStream, aVar.f43305g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i11, a aVar) throws IOException {
        int i12 = aVar.f43305g;
        byte[] bArr = new byte[(((Integer.bitCount(i11 & (-2)) * i12) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f43307i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i13 = 0;
            for (int i14 = 1; i14 <= 4; i14 <<= 1) {
                if (i14 != 1 && (i14 & i11) != 0) {
                    if ((i14 & iIntValue2) == i14) {
                        int i15 = (i13 * i12) + iIntValue;
                        int i16 = i15 / 8;
                        bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
                    }
                    i13++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        int i11 = 0;
        for (Map.Entry entry : aVar.f43307i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i11);
                v(byteArrayOutputStream, 0);
                i11 = iIntValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, w9.c r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.d.t(android.content.Context, java.util.concurrent.Executor, w9.c, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j9, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) ((j9 >> (i12 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i11) throws IOException {
        u(byteArrayOutputStream, i11, 2);
    }
}
