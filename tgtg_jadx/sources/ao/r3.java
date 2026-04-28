package ao;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt.p f4440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f4441b;

    public r3(kt.p pVar, g3 g3Var) {
        pVar.getClass();
        g3Var.getClass();
        this.f4440a = pVar;
        this.f4441b = g3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, z70.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ao.i3
            if (r0 == 0) goto L13
            r0 = r10
            ao.i3 r0 = (ao.i3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.i3 r0 = new ao.i3
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f4316j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r10)
            u70.q r10 = (u70.q) r10
            java.lang.Object r9 = r10.f40851a
            return r9
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L32:
            ba0.g.M(r10)
            com.app.tgtg.model.remote.voucher.request.AddVoucherRequest r10 = new com.app.tgtg.model.remote.voucher.request.AddVoucherRequest
            android.content.SharedPreferences r2 = ft.e.f17922c
            r4 = 0
            java.lang.String r5 = "appDataStorage"
            if (r2 != 0) goto L42
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r2 = r4
        L42:
            java.lang.String r6 = "unique_device_id"
            java.lang.String r2 = r2.getString(r6, r4)
            if (r2 != 0) goto L61
            java.lang.String r2 = j4.s.e()
            android.content.SharedPreferences r7 = ft.e.f17922c
            if (r7 != 0) goto L56
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            goto L57
        L56:
            r4 = r7
        L57:
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r4.putString(r6, r2)
            r4.apply()
        L61:
            r10.<init>(r9, r2)
            r0.l = r3
            kt.p r9 = r8.f4440a
            java.lang.Object r9 = r9.f(r10, r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r3.a(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.j3
            if (r0 == 0) goto L13
            r0 = r5
            ao.j3 r0 = (ao.j3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.j3 r0 = new ao.j3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4325j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            goto L40
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r0.l = r3
            kt.p r5 = r4.f4440a
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Throwable r0 = u70.q.a(r5)
            if (r0 != 0) goto L4d
            com.app.tgtg.model.remote.voucher.response.BasicDiscountVoucherList r5 = (com.app.tgtg.model.remote.voucher.response.BasicDiscountVoucherList) r5
            java.util.List r5 = r5.getDiscounts()
            return r5
        L4d:
            kotlin.collections.n0 r5 = kotlin.collections.n0.f26529a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r3.b(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.k3
            if (r0 == 0) goto L13
            r0 = r5
            ao.k3 r0 = (ao.k3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.k3 r0 = new ao.k3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4337j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            goto L40
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r0.l = r3
            kt.p r5 = r4.f4440a
            java.lang.Object r5 = r5.h(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Throwable r0 = u70.q.a(r5)
            if (r0 != 0) goto L4d
            com.app.tgtg.model.remote.voucher.response.BasicVoucherList r5 = (com.app.tgtg.model.remote.voucher.response.BasicVoucherList) r5
            java.util.List r5 = r5.getVouchers()
            return r5
        L4d:
            kotlin.collections.n0 r5 = kotlin.collections.n0.f26529a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r3.c(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.l3
            if (r0 == 0) goto L13
            r0 = r5
            ao.l3 r0 = (ao.l3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.l3 r0 = new ao.l3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4345j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            goto L40
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r0.l = r3
            kt.p r5 = r4.f4440a
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Throwable r0 = u70.q.a(r5)
            if (r0 != 0) goto L70
            com.app.tgtg.model.remote.voucher.response.VoucherAndDiscountList r5 = (com.app.tgtg.model.remote.voucher.response.VoucherAndDiscountList) r5
            java.util.List r5 = r5.getCombinedVouchersAndDiscounts()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.e0.o(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L5b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r5.next()
            com.app.tgtg.model.remote.voucher.response.VoucherAndDiscountItem r1 = (com.app.tgtg.model.remote.voucher.response.VoucherAndDiscountItem) r1
            com.app.tgtg.model.remote.voucher.BasicVoucher r1 = r1.getValue()
            r0.add(r1)
            goto L5b
        L6f:
            return r0
        L70:
            kotlin.collections.n0 r5 = kotlin.collections.n0.f26529a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r3.d(z70.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.app.tgtg.model.remote.voucher.VoucherMode r7, java.lang.String r8, z70.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ao.m3
            if (r0 == 0) goto L13
            r0 = r9
            ao.m3 r0 = (ao.m3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.m3 r0 = new ao.m3
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f4365j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            ba0.g.M(r9)
            u70.q r9 = (u70.q) r9
            java.lang.Object r7 = r9.f40851a
            goto L57
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            return r3
        L35:
            ba0.g.M(r9)
            u70.q r9 = (u70.q) r9
            java.lang.Object r7 = r9.f40851a
            return r7
        L3d:
            ba0.g.M(r9)
            int[] r9 = ao.h3.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r9[r7]
            kt.p r9 = r6.f4440a
            if (r7 == r5) goto L68
            if (r7 != r4) goto L64
            r0.l = r4
            java.lang.Object r7 = r9.g(r8, r0)
            if (r7 != r1) goto L57
            goto L70
        L57:
            u70.o r8 = u70.q.f40850b
            boolean r8 = r7 instanceof u70.p
            if (r8 != 0) goto L63
            com.app.tgtg.model.remote.voucher.response.DiscountVoucherDetails r7 = (com.app.tgtg.model.remote.voucher.response.DiscountVoucherDetails) r7
            com.app.tgtg.model.remote.voucher.response.VoucherDetails r7 = r7.toVoucherDetailsResponse()
        L63:
            return r7
        L64:
            e40.a.f()
            return r3
        L68:
            r0.l = r5
            java.lang.Object r7 = r9.j(r8, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r3.e(com.app.tgtg.model.remote.voucher.VoucherMode, java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r6 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.app.tgtg.model.remote.voucher.response.VoucherType r6, java.lang.String r7, z70.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ao.n3
            if (r0 == 0) goto L13
            r0 = r8
            ao.n3 r0 = (ao.n3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.n3 r0 = new ao.n3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f4377j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r6 = r8.f40851a
            return r6
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L35:
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r6 = r8.f40851a
            goto L55
        L3d:
            ba0.g.M(r8)
            int[] r8 = ao.h3.$EnumSwitchMapping$1
            int r6 = r6.ordinal()
            r6 = r8[r6]
            kt.p r8 = r5.f4440a
            if (r6 != r4) goto L62
            r0.l = r4
            java.lang.Object r6 = r8.g(r7, r0)
            if (r6 != r1) goto L55
            goto L6a
        L55:
            u70.o r7 = u70.q.f40850b
            boolean r7 = r6 instanceof u70.p
            if (r7 != 0) goto L61
            com.app.tgtg.model.remote.voucher.response.DiscountVoucherDetails r6 = (com.app.tgtg.model.remote.voucher.response.DiscountVoucherDetails) r6
            com.app.tgtg.model.remote.voucher.response.VoucherDetails r6 = r6.toVoucherDetailsResponse()
        L61:
            return r6
        L62:
            r0.l = r3
            java.lang.Object r6 = r8.j(r7, r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r3.f(com.app.tgtg.model.remote.voucher.response.VoucherType, java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.app.tgtg.model.remote.voucher.VoucherMode r7, z70.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ao.o3
            if (r0 == 0) goto L13
            r0 = r8
            ao.o3 r0 = (ao.o3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.o3 r0 = new ao.o3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f4387j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r7 = r8.f40851a
            goto L57
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            return r3
        L35:
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r7 = r8.f40851a
            goto L71
        L3d:
            ba0.g.M(r8)
            int[] r8 = ao.h3.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r8[r7]
            kt.p r8 = r6.f4440a
            if (r7 == r5) goto L68
            if (r7 != r4) goto L64
            r0.l = r4
            java.lang.Object r7 = r8.a(r0)
            if (r7 != r1) goto L57
            goto L70
        L57:
            u70.o r8 = u70.q.f40850b
            boolean r8 = r7 instanceof u70.p
            if (r8 != 0) goto L63
            com.app.tgtg.model.remote.voucher.response.BasicDiscountVoucherList r7 = (com.app.tgtg.model.remote.voucher.response.BasicDiscountVoucherList) r7
            java.util.List r7 = r7.getDiscounts()
        L63:
            return r7
        L64:
            e40.a.f()
            return r3
        L68:
            r0.l = r5
            java.lang.Object r7 = r8.d(r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            u70.o r8 = u70.q.f40850b
            boolean r8 = r7 instanceof u70.p
            if (r8 != 0) goto L7d
            com.app.tgtg.model.remote.voucher.response.BasicVoucherList r7 = (com.app.tgtg.model.remote.voucher.response.BasicVoucherList) r7
            java.util.List r7 = r7.getVouchers()
        L7d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r3.g(com.app.tgtg.model.remote.voucher.VoucherMode, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.p3
            if (r0 == 0) goto L13
            r0 = r5
            ao.p3 r0 = (ao.p3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.p3 r0 = new ao.p3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4400j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            goto L40
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r5)
            r0.l = r3
            kt.p r5 = r4.f4440a
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            u70.o r0 = u70.q.f40850b
            boolean r0 = r5 instanceof u70.p
            if (r0 != 0) goto L70
            com.app.tgtg.model.remote.voucher.response.VoucherAndDiscountList r5 = (com.app.tgtg.model.remote.voucher.response.VoucherAndDiscountList) r5
            java.util.List r5 = r5.getCombinedVouchersAndDiscounts()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.e0.o(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L5b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r5.next()
            com.app.tgtg.model.remote.voucher.response.VoucherAndDiscountItem r1 = (com.app.tgtg.model.remote.voucher.response.VoucherAndDiscountItem) r1
            com.app.tgtg.model.remote.voucher.BasicVoucher r1 = r1.getValue()
            r0.add(r1)
            goto L5b
        L6f:
            return r0
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r3.h(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.app.tgtg.model.remote.voucher.VoucherMode r6, java.lang.String r7, z70.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ao.q3
            if (r0 == 0) goto L13
            r0 = r8
            ao.q3 r0 = (ao.q3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.q3 r0 = new ao.q3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f4411j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r6 = r8.f40851a
            return r6
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L35:
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r6 = r8.f40851a
            return r6
        L3d:
            ba0.g.M(r8)
            int[] r8 = ao.h3.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r8[r6]
            kt.p r8 = r5.f4440a
            if (r6 == r4) goto L5d
            if (r6 != r3) goto L58
            r0.l = r3
            java.lang.Object r6 = r8.k(r7, r0)
            if (r6 != r1) goto L57
            goto L65
        L57:
            return r6
        L58:
            e40.a.f()
            r6 = 0
            return r6
        L5d:
            r0.l = r4
            java.lang.Object r6 = r8.c(r7, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r3.i(com.app.tgtg.model.remote.voucher.VoucherMode, java.lang.String, z70.c):java.lang.Object");
    }
}
