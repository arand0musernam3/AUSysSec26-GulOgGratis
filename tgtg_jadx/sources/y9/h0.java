package y9;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f45668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y80.j f45669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String[] f45670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f45671d;

    public h0(Ref.ObjectRef objectRef, y80.j jVar, String[] strArr, int[] iArr) {
        this.f45668a = objectRef;
        this.f45669b = jVar;
        this.f45670c = strArr;
        this.f45671d = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r6.emit(r15, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r6.emit(r15, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // y80.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(int[] r14, x70.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof y9.g0
            if (r0 == 0) goto L13
            r0 = r15
            y9.g0 r0 = (y9.g0) r0
            int r1 = r0.f45665m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45665m = r1
            goto L18
        L13:
            y9.g0 r0 = new y9.g0
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f45664k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f45665m
            kotlin.jvm.internal.Ref$ObjectRef r3 = r13.f45668a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 == r5) goto L30
            if (r2 != r4) goto L29
            goto L30
        L29:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r14)
            r14 = 0
            return r14
        L30:
            int[] r14 = r0.f45663j
            ba0.g.M(r15)
            goto L91
        L36:
            ba0.g.M(r15)
            T r15 = r3.element
            java.lang.String[] r2 = r13.f45670c
            y80.j r6 = r13.f45669b
            if (r15 != 0) goto L50
            java.util.Set r15 = kotlin.collections.y.W(r2)
            r0.f45663j = r14
            r0.f45665m = r5
            java.lang.Object r15 = r6.emit(r15, r0)
            if (r15 != r1) goto L91
            goto L90
        L50:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r5 = r2.length
            r7 = 0
            r8 = r7
        L58:
            if (r7 >= r5) goto L7c
            r9 = r2[r7]
            int r10 = r8 + 1
            T r11 = r3.element
            if (r11 == 0) goto L75
            int[] r11 = (int[]) r11
            int[] r12 = r13.f45671d
            r8 = r12[r8]
            r11 = r11[r8]
            r8 = r14[r8]
            if (r11 == r8) goto L71
            r15.add(r9)
        L71:
            int r7 = r7 + 1
            r8 = r10
            goto L58
        L75:
            java.lang.String r14 = "Required value was null."
            com.braze.h2.b(r14)
            r14 = 0
            return r14
        L7c:
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto L91
            java.util.Set r15 = kotlin.collections.CollectionsKt.v0(r15)
            r0.f45663j = r14
            r0.f45665m = r4
            java.lang.Object r15 = r6.emit(r15, r0)
            if (r15 != r1) goto L91
        L90:
            return r1
        L91:
            r3.element = r14
            kotlin.Unit r14 = kotlin.Unit.f26487a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.h0.emit(int[], x70.c):java.lang.Object");
    }
}
