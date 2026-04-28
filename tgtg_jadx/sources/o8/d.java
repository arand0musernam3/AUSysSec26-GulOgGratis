package o8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import r8.k;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f32061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f32062d;

    public d(long j9, byte[] bArr, int i11, int i12) {
        this.f32059a = i11;
        this.f32060b = i12;
        this.f32061c = j9;
        this.f32062d = bArr;
    }

    public static d a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(h.f32072d0);
        return new d(1, bytes.length, bytes);
    }

    public static d b(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(h.f32072d0);
        return new d(2, bytes.length, bytes);
    }

    public static d c(long j9, ByteOrder byteOrder) {
        return d(new long[]{j9}, byteOrder);
    }

    public static d d(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.U[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j9 : jArr) {
            byteBufferWrap.putInt((int) j9);
        }
        return new d(4, jArr.length, byteBufferWrap.array());
    }

    public static d e(f[] fVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.U[5] * fVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (f fVar : fVarArr) {
            byteBufferWrap.putInt((int) fVar.f32067a);
            byteBufferWrap.putInt((int) fVar.f32068b);
        }
        return new d(5, fVarArr.length, byteBufferWrap.array());
    }

    public static d f(int i11, ByteOrder byteOrder) {
        return g(new int[]{i11}, byteOrder);
    }

    public static d g(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.U[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i11 : iArr) {
            byteBufferWrap.putShort((short) i11);
        }
        return new d(3, iArr.length, byteBufferWrap.array());
    }

    public final double h(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objK instanceof String) {
            return Double.parseDouble((String) objK);
        }
        if (objK instanceof long[]) {
            if (((long[]) objK).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objK instanceof int[]) {
            if (((int[]) objK).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objK instanceof double[]) {
            double[] dArr = (double[]) objK;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objK instanceof f[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        f[] fVarArr = (f[]) objK;
        if (fVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        f fVar = fVarArr[0];
        return fVar.f32067a / fVar.f32068b;
    }

    public final int i(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objK instanceof String) {
            return Integer.parseInt((String) objK);
        }
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objK instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objK;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String j(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            return null;
        }
        if (objK instanceof String) {
            return (String) objK;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            while (i11 < jArr.length) {
                sb2.append(jArr[i11]);
                i11++;
                if (i11 != jArr.length) {
                    sb2.append(MessageLogView.COMMA_SEPARATOR);
                }
            }
            return sb2.toString();
        }
        if (objK instanceof int[]) {
            int[] iArr = (int[]) objK;
            while (i11 < iArr.length) {
                sb2.append(iArr[i11]);
                i11++;
                if (i11 != iArr.length) {
                    sb2.append(MessageLogView.COMMA_SEPARATOR);
                }
            }
            return sb2.toString();
        }
        if (objK instanceof double[]) {
            double[] dArr = (double[]) objK;
            while (i11 < dArr.length) {
                sb2.append(dArr[i11]);
                i11++;
                if (i11 != dArr.length) {
                    sb2.append(MessageLogView.COMMA_SEPARATOR);
                }
            }
            return sb2.toString();
        }
        if (!(objK instanceof f[])) {
            return null;
        }
        f[] fVarArr = (f[]) objK;
        while (i11 < fVarArr.length) {
            sb2.append(fVarArr[i11].f32067a);
            sb2.append('/');
            sb2.append(fVarArr[i11].f32068b);
            i11++;
            if (i11 != fVarArr.length) {
                sb2.append(MessageLogView.COMMA_SEPARATOR);
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [o8.f[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [o8.f[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable k(java.nio.ByteOrder r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.d.k(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(h.T[this.f32059a]);
        sb2.append(", data length:");
        return k.i(this.f32062d.length, ")", sb2);
    }

    public d(int i11, int i12, byte[] bArr) {
        this(-1L, bArr, i11, i12);
    }
}
