package g3;

import kotlin.jvm.functions.Function2;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19776a = 16;

    /* JADX WARN: Removed duplicated region for block: B:127:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(b4.t r24, kotlin.jvm.functions.Function2 r25, kotlin.jvm.functions.Function2 r26, kotlin.jvm.functions.Function2 r27, kotlin.jvm.functions.Function2 r28, int r29, long r30, long r32, d2.y2 r34, final u3.d r35, m3.n r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.x5.a(b4.t, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, int, long, long, d2.y2, u3.d, m3.n, int, int):void");
    }

    public static final void b(int i11, Function2 function2, u3.d dVar, Function2 function22, Function2 function23, d2.y2 y2Var, Function2 function24, m3.n nVar, int i12) {
        int i13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-280287501);
        int i14 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.h(function2) ? 32 : 16) | (sVar.h(dVar) ? 256 : 128) | (sVar.h(function22) ? 2048 : 1024) | (sVar.h(function23) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.f(y2Var) ? 131072 : 65536) | (sVar.h(function24) ? 1048576 : 524288);
        if (sVar.R(i14 & 1, (599187 & i14) != 599186)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new w5();
                sVar.k0(objM);
            }
            w5 w5Var = (w5) objM;
            boolean z11 = (i14 & 112) == 32;
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                objM2 = new u3.d(new b3.n(7, function2), true, 605195056);
                sVar.k0(objM2);
            }
            Function2 function25 = (Function2) objM2;
            boolean z12 = (i14 & 7168) == 2048;
            Object objM3 = sVar.M();
            if (z12 || objM3 == fVar) {
                objM3 = new u3.d(new b3.n(8, function22), true, 418899191);
                sVar.k0(objM3);
            }
            Function2 function26 = (Function2) objM3;
            boolean z13 = (57344 & i14) == 16384;
            Object objM4 = sVar.M();
            if (z13 || objM4 == fVar) {
                objM4 = new u3.d(new b3.n(9, function23), true, 338600263);
                sVar.k0(objM4);
            }
            Function2 function27 = (Function2) objM4;
            boolean z14 = (i14 & 896) == 256;
            Object objM5 = sVar.M();
            if (z14 || objM5 == fVar) {
                i13 = i14;
                objM5 = new u3.d(new a3.u2(23, (i80.n) dVar, (Object) w5Var), true, -1776388365);
                sVar.k0(objM5);
            } else {
                i13 = i14;
            }
            Function2 function28 = (Function2) objM5;
            boolean z15 = (i13 & 3670016) == 1048576;
            Object objM6 = sVar.M();
            if (z15 || objM6 == fVar) {
                objM6 = new u3.d(new b3.n(10, function24), true, -1731662488);
                sVar.k0(objM6);
            }
            Function2 function29 = (Function2) objM6;
            boolean zF = ((i13 & 458752) == 131072) | sVar.f(function25) | sVar.f(function26) | sVar.f(function27) | ((i13 & 14) == 4) | sVar.f(function29) | sVar.f(function28);
            Object objM7 = sVar.M();
            if (zF || objM7 == fVar) {
                c60.f fVar2 = new c60.f(y2Var, function25, function26, function27, i11, function29, w5Var, function28);
                sVar.k0(fVar2);
                objM7 = fVar2;
            }
            z4.c0.b(null, (Function2) objM7, sVar, 0, 1);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.a0(i11, function2, dVar, function22, function23, y2Var, function24, i12);
        }
    }
}
