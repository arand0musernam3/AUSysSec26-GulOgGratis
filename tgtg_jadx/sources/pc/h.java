package pc;

import a90.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ed.n;
import ed.o;
import ed.q;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import q90.v;
import tc.j;
import u70.t;
import v80.d2;
import v80.f0;
import v80.j0;
import v80.p0;
import zc.k;
import zc.r;
import zendesk.ui.android.internal.ImageLoaderFactory$getImageLoader$1$5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.c f34656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f34657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f34658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f34659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a90.d f34660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t5.a f34661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f34662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f34663i;

    public h(Context context, zc.c cVar, t tVar, t tVar2, t tVar3, a aVar, n nVar, ImageLoaderFactory$getImageLoader$1$5 imageLoaderFactory$getImageLoader$1$5) {
        this.f34655a = context;
        this.f34656b = cVar;
        this.f34657c = tVar;
        this.f34658d = nVar;
        this.f34659e = imageLoaderFactory$getImageLoader$1$5;
        d2 d2VarD = f0.d();
        c90.f fVar = p0.f42144a;
        this.f34660f = f0.b(kotlin.coroutines.e.c(d2VarD, p.f1044a.f43295e).plus(new g(this)));
        q qVar = new q(this);
        t5.a aVar2 = new t5.a(this, qVar, imageLoaderFactory$getImageLoader$1$5);
        this.f34661g = aVar2;
        fd.d dVar = new fd.d(aVar);
        dVar.d(new wc.a(2), v.class);
        int i11 = 5;
        dVar.d(new wc.a(i11), String.class);
        dVar.d(new wc.a(1), Uri.class);
        dVar.d(new wc.a(4), Uri.class);
        int i12 = 3;
        dVar.d(new wc.a(i12), Integer.class);
        int i13 = 0;
        dVar.d(new wc.a(i13), byte[].class);
        Pair pair = new Pair(new vc.c(), Uri.class);
        ArrayList arrayList = dVar.f17553c;
        arrayList.add(pair);
        arrayList.add(new Pair(new vc.a(nVar.f15935a), File.class));
        dVar.c(new j(tVar3, tVar2, nVar.f15937c), Uri.class);
        dVar.c(new tc.a(i11), File.class);
        dVar.c(new tc.a(i13), Uri.class);
        dVar.c(new tc.a(i12), Uri.class);
        dVar.c(new tc.a(6), Uri.class);
        dVar.c(new tc.a(4), Drawable.class);
        dVar.c(new tc.a(1), Bitmap.class);
        dVar.c(new tc.a(2), ByteBuffer.class);
        qc.b bVar = new qc.b(nVar.f15938d, nVar.f15939e);
        ArrayList arrayList2 = dVar.f17555e;
        arrayList2.add(bVar);
        List listO = a.a.O(dVar.f17551a);
        this.f34662h = new a(listO, a.a.O(dVar.f17552b), a.a.O(arrayList), a.a.O(dVar.f17554d), a.a.O(arrayList2));
        this.f34663i = CollectionsKt.e0(listO, new uc.h(this, qVar, aVar2, imageLoaderFactory$getImageLoader$1$5));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1 A[Catch: all -> 0x00de, PHI: r1 r2 r3 r4
      0x00e1: PHI (r1v16 pc.h) = (r1v3 pc.h), (r1v17 pc.h), (r1v18 pc.h) binds: [B:28:0x0076, B:37:0x00c8, B:39:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r2v14 zc.q) = (r2v5 zc.q), (r2v26 zc.q), (r2v27 zc.q) binds: [B:28:0x0076, B:37:0x00c8, B:39:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r3v13 zc.k) = (r3v23 zc.k), (r3v24 zc.k), (r3v25 zc.k) binds: [B:28:0x0076, B:37:0x00c8, B:39:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r4v13 pc.b) = (r4v3 pc.b), (r4v16 pc.b), (r4v17 pc.b) binds: [B:28:0x0076, B:37:0x00c8, B:39:0x00da] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {all -> 0x00de, blocks: (B:43:0x00e1, B:45:0x00eb, B:46:0x00ee, B:48:0x00ff, B:49:0x0102, B:51:0x0109, B:52:0x010c, B:34:0x00bf, B:36:0x00c5, B:38:0x00ca, B:78:0x0186, B:79:0x018d), top: B:107:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb A[Catch: all -> 0x00de, TryCatch #6 {all -> 0x00de, blocks: (B:43:0x00e1, B:45:0x00eb, B:46:0x00ee, B:48:0x00ff, B:49:0x0102, B:51:0x0109, B:52:0x010c, B:34:0x00bf, B:36:0x00c5, B:38:0x00ca, B:78:0x0186, B:79:0x018d), top: B:107:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff A[Catch: all -> 0x00de, TryCatch #6 {all -> 0x00de, blocks: (B:43:0x00e1, B:45:0x00eb, B:46:0x00ee, B:48:0x00ff, B:49:0x0102, B:51:0x0109, B:52:0x010c, B:34:0x00bf, B:36:0x00c5, B:38:0x00ca, B:78:0x0186, B:79:0x018d), top: B:107:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109 A[Catch: all -> 0x00de, TryCatch #6 {all -> 0x00de, blocks: (B:43:0x00e1, B:45:0x00eb, B:46:0x00ee, B:48:0x00ff, B:49:0x0102, B:51:0x0109, B:52:0x010c, B:34:0x00bf, B:36:0x00c5, B:38:0x00ca, B:78:0x0186, B:79:0x018d), top: B:107:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0158 A[Catch: all -> 0x0161, TryCatch #1 {all -> 0x0161, blocks: (B:62:0x0152, B:64:0x0158, B:67:0x0166, B:69:0x016a, B:72:0x0176, B:73:0x017b), top: B:99:0x0152 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0166 A[Catch: all -> 0x0161, TryCatch #1 {all -> 0x0161, blocks: (B:62:0x0152, B:64:0x0158, B:67:0x0166, B:69:0x016a, B:72:0x0176, B:73:0x017b), top: B:99:0x0152 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [zc.j] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [pc.h] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [zc.q] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [zc.k] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(pc.h r22, zc.k r23, int r24, z70.c r25) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.h.a(pc.h, zc.k, int, z70.c):java.lang.Object");
    }

    public final zc.e b(k kVar) {
        j0 j0VarF = f0.f(this.f34660f, null, null, new e(this, kVar, null, 0), 3);
        bd.b bVar = kVar.f47466c;
        return bVar instanceof bd.a ? ed.k.c(((bd.a) bVar).f6105b).b() : new x0.e(j0VarF, 9);
    }

    public final void c(zc.f fVar, bd.b bVar, b bVar2) {
        k kVar = fVar.f47437b;
        Drawable drawable = fVar.f47436a;
        o oVar = this.f34659e;
        if (oVar != null && oVar.getLevel() <= 4) {
            oVar.log("RealImageLoader", 4, "🚨 Failed - " + kVar.f47465b + " - " + fVar.f47438c, null);
        }
        if (bVar instanceof bd.a) {
            bd.a aVar = (bd.a) bVar;
            dd.e eVarA = kVar.f47472i.a(aVar, fVar);
            if (eVarA instanceof dd.c) {
                aVar.b(drawable);
            } else {
                bVar2.getClass();
                eVarA.d();
            }
        } else if (bVar != null) {
            bVar.onError(drawable);
        }
        bVar2.getClass();
        zc.j jVar = kVar.f47467d;
        if (jVar != null) {
            jVar.onError(kVar, fVar);
        }
    }

    public final void d(r rVar, bd.b bVar, b bVar2) {
        String str;
        k kVar = rVar.f47509b;
        Drawable drawable = rVar.f47508a;
        qc.f fVar = rVar.f47510c;
        o oVar = this.f34659e;
        if (oVar != null && oVar.getLevel() <= 4) {
            StringBuilder sb2 = new StringBuilder();
            Bitmap.Config[] configArr = ed.k.f15927a;
            int i11 = ed.j.$EnumSwitchMapping$0[fVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                str = "🧠";
            } else if (i11 == 3) {
                str = "💾";
            } else {
                if (i11 != 4) {
                    e40.a.f();
                    return;
                }
                str = "☁️ ";
            }
            sb2.append(str);
            sb2.append(" Successful (");
            sb2.append(fVar.name());
            sb2.append(") - ");
            sb2.append(kVar.f47465b);
            oVar.log("RealImageLoader", 4, sb2.toString(), null);
        }
        if (bVar instanceof bd.a) {
            bd.a aVar = (bd.a) bVar;
            dd.e eVarA = kVar.f47472i.a(aVar, rVar);
            if (eVarA instanceof dd.c) {
                aVar.b(drawable);
            } else {
                bVar2.getClass();
                eVarA.d();
            }
        } else if (bVar != null) {
            bVar.onSuccess(drawable);
        }
        bVar2.getClass();
        zc.j jVar = kVar.f47467d;
        if (jVar != null) {
            jVar.onSuccess(kVar, rVar);
        }
    }
}
