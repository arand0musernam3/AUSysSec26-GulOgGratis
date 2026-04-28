package qc;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f36881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.n f36882b;

    public a0(b0 b0Var, zc.n nVar) {
        this.f36881a = b0Var;
        this.f36882b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable b(a0 a0Var, Ref.BooleanRef booleanRef) throws IOException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        b0 d0Var = a0Var.f36881a;
        ia0.i iVarP0 = d0Var.p0();
        if (iVarP0.X(0L, r.f36920b) || iVarP0.X(0L, r.f36919a)) {
            d0Var = new d0(new ia0.d0(new q(d0Var.p0())), new bo.a(a0Var.f36882b.f47490a, 16), null);
        }
        try {
            return ImageDecoder.decodeDrawable(a0Var.c(d0Var), new w(objectRef, a0Var, booleanRef));
        } finally {
            ImageDecoder imageDecoder = (ImageDecoder) objectRef.element;
            if (imageDecoder != null) {
                imageDecoder.close();
            }
            d0Var.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // qc.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(x70.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof qc.v
            if (r0 == 0) goto L13
            r0 = r7
            qc.v r0 = (qc.v) r0
            int r1 = r0.f36934n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36934n = r1
            goto L1a
        L13:
            qc.v r0 = new qc.v
            z70.c r7 = (z70.c) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f36934n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f36931j
            kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref.BooleanRef) r0
            ba0.g.M(r7)
            goto L72
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L37:
            kotlin.jvm.internal.Ref$BooleanRef r2 = r0.f36932k
            java.lang.Object r4 = r0.f36931j
            qc.a0 r4 = (qc.a0) r4
            ba0.g.M(r7)
            goto L61
        L41:
            ba0.g.M(r7)
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            m90.z r2 = new m90.z
            r5 = 25
            r2.<init>(r5, r6, r7)
            r0.f36931j = r6
            r0.f36932k = r7
            r0.f36934n = r4
            java.lang.Object r2 = v80.f0.G(r2, r0)
            if (r2 != r1) goto L5d
            goto L70
        L5d:
            r4 = r2
            r2 = r7
            r7 = r4
            r4 = r6
        L61:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r0.f36931j = r2
            r5 = 0
            r0.f36932k = r5
            r0.f36934n = r3
            java.lang.Object r7 = r4.d(r7, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            r0 = r2
        L72:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            boolean r0 = r0.element
            qc.g r1 = new qc.g
            r1.<init>(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.a0.a(x70.c):java.lang.Object");
    }

    public final ImageDecoder.Source c(b0 b0Var) {
        ia0.a0 a0VarH0 = b0Var.h0();
        if (a0VarH0 != null) {
            return ImageDecoder.createSource(a0VarH0.toFile());
        }
        z20.b bVarE = b0Var.e();
        boolean z11 = bVarE instanceof a;
        zc.n nVar = this.f36882b;
        if (z11) {
            return ImageDecoder.createSource(nVar.f47490a.getAssets(), ((a) bVarE).f36880h);
        }
        if (bVarE instanceof e) {
            return ImageDecoder.createSource(nVar.f47490a.getContentResolver(), ((e) bVarE).f36901h);
        }
        if (bVarE instanceof c0) {
            c0 c0Var = (c0) bVarE;
            if (Intrinsics.areEqual(c0Var.f36889h, nVar.f47490a.getPackageName())) {
                return ImageDecoder.createSource(nVar.f47490a.getResources(), c0Var.f36890i);
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 31 ? ImageDecoder.createSource(b0Var.p0().v()) : i11 == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(b0Var.p0().v())) : ImageDecoder.createSource(b0Var.a().toFile());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.graphics.drawable.Drawable r8, z70.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof qc.x
            if (r0 == 0) goto L13
            r0 = r9
            qc.x r0 = (qc.x) r0
            int r1 = r0.f36941n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36941n = r1
            goto L18
        L13:
            qc.x r0 = new qc.x
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f36941n
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            java.lang.Object r8 = r0.f36939k
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            qc.a0 r0 = r0.f36938j
            ba0.g.M(r9)
            goto L87
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            return r3
        L34:
            ba0.g.M(r9)
            boolean r9 = r8 instanceof android.graphics.drawable.AnimatedImageDrawable
            if (r9 != 0) goto L3c
            return r8
        L3c:
            r9 = r8
            android.graphics.drawable.AnimatedImageDrawable r9 = (android.graphics.drawable.AnimatedImageDrawable) r9
            zc.n r2 = r7.f36882b
            zc.p r5 = r2.l
            zc.p r2 = r2.l
            java.lang.String r6 = "coil#repeat_count"
            java.lang.Object r5 = r5.b(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L54
            int r5 = r5.intValue()
            goto L55
        L54:
            r5 = -1
        L55:
            r9.setRepeatCount(r5)
            java.lang.String r9 = "coil#animation_start_callback"
            java.lang.Object r9 = r2.b(r9)
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            java.lang.String r5 = "coil#animation_end_callback"
            java.lang.Object r2 = r2.b(r5)
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            if (r9 != 0) goto L6f
            if (r2 == 0) goto L6d
            goto L6f
        L6d:
            r0 = r7
            goto L87
        L6f:
            c90.f r5 = v80.p0.f42144a
            w80.c r5 = a90.p.f1044a
            w80.c r5 = r5.f43295e
            qc.z r6 = new qc.z
            r6.<init>(r8, r9, r2, r3)
            r0.f36938j = r7
            r0.f36939k = r8
            r0.f36941n = r4
            java.lang.Object r9 = v80.f0.K(r5, r6, r0)
            if (r9 != r1) goto L6d
            return r1
        L87:
            sc.c r9 = new sc.c
            zc.n r0 = r0.f36882b
            ad.g r0 = r0.f47494e
            r9.<init>(r8, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.a0.d(android.graphics.drawable.Drawable, z70.c):java.lang.Object");
    }
}
