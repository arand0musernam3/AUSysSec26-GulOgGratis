package fd;

import a3.x1;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import ia0.a0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f17594f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f17595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a90.d f17596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oz.m f17597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f17598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile /* synthetic */ int f17599e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(t.class, "e");
    }

    public t(q qVar) {
        this.f17595a = qVar;
        int i11 = 0;
        this.f17596b = f0.b(kotlin.coroutines.e.c(f0.d(), new u(v80.y.f42175a, i11)));
        ae.c cVar = new ae.c();
        cVar.f1243b = new WeakReference(this);
        cVar.f1244c = new ae.a(cVar, this);
        cVar.f1245d = new ae.b(cVar, i11);
        oz.m mVar = new oz.m(this);
        this.f17597c = mVar;
        d dVar = new d(qVar.f17584f);
        td.f fVar = qVar.f17580b;
        Object obj = fVar.f39986n.f17570a.get(o.f17574a);
        boolean zBooleanValue = ((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue();
        int i12 = 3;
        int i13 = 2;
        ArrayList arrayList = dVar.f17554d;
        ArrayList arrayList2 = dVar.f17555e;
        if (zBooleanValue) {
            arrayList.add(new n(i13));
            arrayList2.add(new n(i12));
        }
        dVar.b(new nd.a(i11), Reflection.getOrCreateKotlinClass(Uri.class));
        dVar.b(new nd.a(i12), Reflection.getOrCreateKotlinClass(Integer.class));
        Pair pair = new Pair(new md.a(0), Reflection.getOrCreateKotlinClass(z.class));
        ArrayList arrayList3 = dVar.f17553c;
        arrayList3.add(pair);
        dVar.a(new kd.a(i11), Reflection.getOrCreateKotlinClass(z.class));
        int i14 = 4;
        dVar.a(new kd.a(i14), Reflection.getOrCreateKotlinClass(z.class));
        dVar.a(new kd.a(9), Reflection.getOrCreateKotlinClass(z.class));
        dVar.a(new kd.a(6), Reflection.getOrCreateKotlinClass(Drawable.class));
        j jVar = p.f17575a;
        Object obj2 = fVar.f39986n.f17570a.get(p.f17575a);
        e90.i iVarA = e90.j.a(((Number) (obj2 == null ? 4 : obj2)).intValue());
        int i15 = Build.VERSION.SDK_INT;
        Object obj3 = id.o.f23800a;
        if (i15 >= 29) {
            Object obj4 = fVar.f39986n.f17570a.get(p.f17577c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = fVar.f39986n.f17570a.get(p.f17576b);
                if (Intrinsics.areEqual((id.o) (obj5 == null ? obj3 : obj5), obj3)) {
                    arrayList2.add(new c(new id.v(iVarA), 0));
                }
            }
        }
        Object obj6 = fVar.f39986n.f17570a.get(p.f17576b);
        arrayList2.add(new c(new id.c(iVarA, (id.o) (obj6 != null ? obj6 : obj3)), 0));
        int i16 = 1;
        dVar.b(new nd.a(i16), Reflection.getOrCreateKotlinClass(File.class));
        dVar.a(new kd.a(8), Reflection.getOrCreateKotlinClass(z.class));
        dVar.a(new kd.a(i12), Reflection.getOrCreateKotlinClass(ByteBuffer.class));
        dVar.b(new nd.a(i14), Reflection.getOrCreateKotlinClass(String.class));
        int i17 = 2;
        dVar.b(new nd.a(i17), Reflection.getOrCreateKotlinClass(a0.class));
        arrayList3.add(new Pair(new md.a(1), Reflection.getOrCreateKotlinClass(z.class)));
        arrayList3.add(new Pair(new md.a(2), Reflection.getOrCreateKotlinClass(z.class)));
        dVar.a(new kd.a(7), Reflection.getOrCreateKotlinClass(z.class));
        dVar.a(new kd.a(i17), Reflection.getOrCreateKotlinClass(byte[].class));
        dVar.a(new kd.a(5), Reflection.getOrCreateKotlinClass(z.class));
        dVar.a(new kd.a(i16), Reflection.getOrCreateKotlinClass(Bitmap.class));
        ld.g gVar = new ld.g(this, cVar, mVar);
        ArrayList arrayList4 = dVar.f17551a;
        arrayList4.add(gVar);
        this.f17598d = new e(android.support.v4.media.session.a.L(arrayList4), android.support.v4.media.session.a.L(dVar.f17552b), android.support.v4.media.session.a.L(arrayList3), android.support.v4.media.session.a.L(arrayList), android.support.v4.media.session.a.L(arrayList2));
    }

    public final void a(td.i iVar) {
        o.d(iVar, f0.f(this.f17596b, (CoroutineContext) this.f17595a.f17581c.getValue(), null, new r(this, iVar, null, 0), 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0188, code lost:
    
        if (r3.h(r9) == r10) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a2 A[Catch: all -> 0x003d, TryCatch #4 {all -> 0x003d, blocks: (B:15:0x0038, B:131:0x01f6, B:133:0x01fc, B:136:0x020b, B:138:0x021b, B:137:0x020f, B:139:0x0221, B:141:0x0225, B:144:0x0231, B:145:0x0236, B:27:0x0063, B:117:0x019b, B:119:0x01a2, B:121:0x01ac, B:122:0x01b6, B:123:0x01b9), top: B:167:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fc A[Catch: all -> 0x003d, TryCatch #4 {all -> 0x003d, blocks: (B:15:0x0038, B:131:0x01f6, B:133:0x01fc, B:136:0x020b, B:138:0x021b, B:137:0x020f, B:139:0x0221, B:141:0x0225, B:144:0x0231, B:145:0x0236, B:27:0x0063, B:117:0x019b, B:119:0x01a2, B:121:0x01ac, B:122:0x01b6, B:123:0x01b9), top: B:167:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0221 A[Catch: all -> 0x003d, TryCatch #4 {all -> 0x003d, blocks: (B:15:0x0038, B:131:0x01f6, B:133:0x01fc, B:136:0x020b, B:138:0x021b, B:137:0x020f, B:139:0x0221, B:141:0x0225, B:144:0x0231, B:145:0x0236, B:27:0x0063, B:117:0x019b, B:119:0x01a2, B:121:0x01ac, B:122:0x01b6, B:123:0x01b9), top: B:167:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0248 A[Catch: all -> 0x0255, TRY_LEAVE, TryCatch #0 {all -> 0x0255, blocks: (B:150:0x0244, B:152:0x0248, B:157:0x0257, B:158:0x025c), top: B:161:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0257 A[Catch: all -> 0x0255, TRY_ENTER, TryCatch #0 {all -> 0x0255, blocks: (B:150:0x0244, B:152:0x0248, B:157:0x0257, B:158:0x025c), top: B:161:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r17v0, types: [fd.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v4, types: [fd.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [td.i] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [td.p] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(td.i r18, int r19, z70.c r20) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.t.b(td.i, int, z70.c):java.lang.Object");
    }

    public final Object c(td.i iVar, z70.c cVar) {
        return ((iVar.f39998c instanceof xd.a) || (iVar.f40010p instanceof ud.f) || ((Lifecycle) o.e(iVar, td.k.f40024e)) != null) ? f0.n(new x1(this, iVar, null, 23), cVar) : b(iVar, 1, cVar);
    }

    public final od.d d() {
        return (od.d) this.f17595a.f17582d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(td.d r3, xd.b r4, fd.g r5) {
        /*
            r2 = this;
            td.i r0 = r3.f39955b
            fd.l r3 = r3.f39954a
            boolean r1 = r4 instanceof xd.a
            if (r1 != 0) goto Lb
            if (r4 == 0) goto L19
            goto L16
        Lb:
            fd.j r1 = td.k.f40020a
            java.lang.Object r1 = fd.o.e(r0, r1)
            zd.a r1 = (zd.a) r1
            r1.getClass()
        L16:
            r4.a(r3)
        L19:
            r5.getClass()
            td.h r3 = r0.f39999d
            if (r3 == 0) goto L23
            r3.onError()
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.t.e(td.d, xd.b, fd.g):void");
    }
}
