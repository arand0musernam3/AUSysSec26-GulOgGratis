package com.app.tgtg.feature.tabprofile.manageaccount.contactus;

import android.app.Application;
import androidx.lifecycle.b;
import androidx.lifecycle.c1;
import androidx.lifecycle.o0;
import ao.c;
import ao.c0;
import ao.g3;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.order.Order;
import et.z;
import gt.j;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.p0;
import sr.r;
import u70.l;
import u70.t;
import vr.a;
import wr.e;
import wr.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/feature/tabprofile/manageaccount/contactus/ContactUsViewModel;", "Landroidx/lifecycle/b;", "FileNotAllowedException", "FileTooBigException", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContactUsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactUsViewModel.kt\ncom/app/tgtg/feature/tabprofile/manageaccount/contactus/ContactUsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,434:1\n1586#2:435\n1661#2,3:436\n37#3,2:439\n*S KotlinDebug\n*F\n+ 1 ContactUsViewModel.kt\ncom/app/tgtg/feature/tabprofile/manageaccount/contactus/ContactUsViewModel\n*L\n168#1:435\n168#1:436,3\n168#1:439,2\n*E\n"})
public final class ContactUsViewModel extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f9381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f9382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f9383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cv.b f9384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f9385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g3 f9386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f9387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f9388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public wr.b f9391k;
    public e l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public BriefOrder f9392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f9393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9394o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f9395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f9396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f9397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f9398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f9399t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final t f9400u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f9401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o0 f9402w;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/tgtg/feature/tabprofile/manageaccount/contactus/ContactUsViewModel$FileNotAllowedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FileNotAllowedException extends RuntimeException {
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/tgtg/feature/tabprofile/manageaccount/contactus/ContactUsViewModel$FileTooBigException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FileTooBigException extends RuntimeException {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactUsViewModel(Application application, c1 c1Var, z zVar, j jVar, cv.b bVar, c0 c0Var, g3 g3Var, c cVar, a aVar) {
        super(application);
        c1Var.getClass();
        zVar.getClass();
        bVar.getClass();
        c0Var.getClass();
        g3Var.getClass();
        cVar.getClass();
        aVar.getClass();
        this.f9381a = c1Var;
        this.f9382b = zVar;
        this.f9383c = jVar;
        this.f9384d = bVar;
        this.f9385e = c0Var;
        this.f9386f = g3Var;
        this.f9387g = cVar;
        this.f9388h = aVar;
        this.f9390j = true;
        this.f9393n = new ArrayList();
        this.f9395p = l.b(new s60.b(28));
        this.f9396q = l.b(new s60.b(29));
        this.f9397r = l.b(new r(0));
        this.f9398s = l.b(new r(1));
        this.f9399t = l.b(new r(2));
        this.f9400u = l.b(new r(3));
        this.f9401v = l.b(new r(4));
        this.f9402w = new o0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel r4, com.app.tgtg.model.remote.support.request.BusinessSupportRequest r5, z70.c r6) {
        /*
            boolean r0 = r6 instanceof sr.u
            if (r0 == 0) goto L13
            r0 = r6
            sr.u r0 = (sr.u) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            sr.u r0 = new sr.u
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f39120j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            goto L40
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L32:
            ba0.g.M(r6)
            ao.c0 r6 = r4.f9385e
            r0.l = r3
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            u70.o r6 = u70.q.f40850b
            boolean r6 = r5 instanceof u70.p
            if (r6 != 0) goto L5f
            r6 = r5
            q90.r0 r6 = (q90.r0) r6
            av.e r6 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.k(r0)
            u70.t r6 = r4.f9399t
            java.lang.Object r6 = r6.getValue()
            av.e r6 = (av.e) r6
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.k(r0)
        L5f:
            java.lang.Throwable r5 = u70.q.a(r5)
            if (r5 == 0) goto L8b
            av.e r6 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.k(r0)
            r6 = 413(0x19d, float:5.79E-43)
            boolean r6 = u00.d.F(r6, r5)
            if (r6 == 0) goto L84
            u70.t r4 = r4.f9397r
            java.lang.Object r4 = r4.getValue()
            av.e r4 = (av.e) r4
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.k(r5)
            goto L8b
        L84:
            av.e r4 = r4.c()
            r4.k(r5)
        L8b:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel.a(com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel, com.app.tgtg.model.remote.support.request.BusinessSupportRequest, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0108, code lost:
    
        if (r1 != r3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[Catch: FileTooBigException -> 0x013f, FileNotAllowedException -> 0x0156, LOOP:0: B:54:0x00d8->B:56:0x00de, LOOP_END, TryCatch #2 {FileNotAllowedException -> 0x0156, FileTooBigException -> 0x013f, blocks: (B:12:0x002b, B:60:0x010b, B:62:0x0111, B:63:0x0128, B:65:0x012e, B:17:0x003c, B:38:0x0083, B:40:0x0088, B:41:0x008a, B:43:0x0093, B:45:0x00a9, B:47:0x00b5, B:53:0x00c5, B:54:0x00d8, B:56:0x00de, B:57:0x00ec, B:49:0x00bb, B:51:0x00c1, B:44:0x009c, B:34:0x0075), top: B:71:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel r18, java.lang.String r19, z70.c r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel.b(com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel, java.lang.String, z70.c):java.lang.Object");
    }

    public final av.e c() {
        return (av.e) this.f9396q.getValue();
    }

    public final g d() {
        return (g) this.f9381a.a("ENTRY_DATA");
    }

    public final av.e e() {
        return (av.e) this.f9395p.getValue();
    }

    public final boolean f() {
        String intervalEnd;
        Order order;
        PickupInterval pickupInterval;
        PickupInterval timeInterval;
        long jO = p0.o();
        BriefOrder briefOrder = this.f9392m;
        if (briefOrder == null || (timeInterval = briefOrder.getTimeInterval()) == null || (intervalEnd = timeInterval.getIntervalEnd()) == null) {
            g gVarD = d();
            intervalEnd = (gVarD == null || (order = gVarD.f43528f) == null || (pickupInterval = order.getPickupInterval()) == null) ? null : pickupInterval.getIntervalEnd();
        }
        return jO > p0.h(intervalEnd);
    }

    public final boolean g() {
        String email;
        g3 g3Var = this.f9386f;
        return g3Var.n().getShouldVerifyEmail() || (email = g3Var.m().getEmail()) == null || email.length() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.io.Serializable, java.lang.String[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(z70.c r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel.h(z70.c):java.io.Serializable");
    }
}
