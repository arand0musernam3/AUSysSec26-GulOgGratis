package ps;

import cg.z;
import d2.m2;
import g3.ga;
import g3.x5;
import gn.b0;
import hg.h;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import lp.w;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import u3.d;
import u3.e;
import v4.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f35613a = new d(new o9.a(20), false, -926903894);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f35614b = new d(new o9.a(21), false, -1811993951);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f35615c = new d(new o9.a(22), false, 871430347);

    public static final void a(List list, boolean z11, Function0 function0, Function1 function1, Function0 function02, n nVar, int i11) {
        s sVar;
        function0.getClass();
        function1.getClass();
        function02.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1023893509);
        int i12 = i11 | (sVar2.h(list) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | (sVar2.h(function1) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function02) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            sVar = sVar2;
            x5.a(f.a(m2.f13850c, ga.c(sVar2).f18456c, null), e.e(-324551241, sVar2, new z(18, function0)), null, null, null, 0, 0L, 0L, null, e.e(905512908, sVar2, new h(2, list, function1, function02, z11)), sVar, 805306416, 508);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.d((Object) list, z11, function0, function1, function02, i11, 9);
        }
    }

    public static final void b(int i11, List list, Function0 function0, Function1 function1, n nVar) {
        s sVar;
        function0.getClass();
        function1.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-750491197);
        int i12 = i11 | (sVar2.h(list) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16) | (sVar2.h(function1) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            sVar = sVar2;
            x5.a(f.a(m2.f13850c, ga.c(sVar2).f18456c, null), e.e(1302530175, sVar2, new z(19, function0)), null, null, null, 0, 0L, 0L, null, e.e(-2016796332, sVar2, new w(list, function1, 1)), sVar, 805306416, 508);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b0(list, function0, function1, i11, 2);
        }
    }
}
