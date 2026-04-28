package a3;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil3.request.NullRequestDataException;
import com.app.tgtg.R;
import com.app.tgtg.feature.storeview.ui.StoreViewActivity;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.manufacturer.response.ItemDetailsFaqItem;
import com.braze.BrazeUser;
import com.braze.enums.Month;
import com.braze.ui.UserJavascriptInterfaceBase;
import g3.ea;
import g3.ka;
import g3.u7;
import g3.v7;
import g3.z4;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.conversationkit.android.model.Message;
import zendesk.messaging.android.internal.conversationscreen.delegates.ImageMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.QuickReplyAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.TextMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.storage.android.internal.ComplexStorage;
import zendesk.ui.android.conversation.quickreply.QuickReplyRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f632d;

    public /* synthetic */ y0(Object obj, Object obj2, Object obj3, int i11) {
        this.f629a = i11;
        this.f630b = obj;
        this.f631c = obj2;
        this.f632d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r5v26 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentManager childFragmentManager;
        String eventId;
        int i11 = this.f629a;
        int i12 = 3;
        final int i13 = 2;
        FragmentManager supportFragmentManager = null;
        boolean z11 = false;
        z = false;
        boolean z12 = false;
        z11 = false;
        Object obj2 = this.f632d;
        Object obj3 = this.f631c;
        Object obj4 = this.f630b;
        switch (i11) {
            case 0:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) obj2;
                w4.v vVar = (w4.v) obj;
                if (((o) obj4).h(vVar.f43180c, (j0) obj3)) {
                    vVar.a();
                    booleanRef.element = true;
                }
                return Unit.f26487a;
            case 1:
                final l3 l3Var = (l3) obj4;
                v80.b0 b0Var = (v80.b0) obj3;
                Context context = (Context) obj2;
                o2.a aVar = (o2.a) obj;
                aVar.a();
                m2.g0.D(aVar, context.getResources(), m2.j1.Cut, (m5.t0.d(l3Var.n().f37715b) || !l3Var.j() || l3Var.f454g == null) ? false : true, new q2(new p3(b0Var, new e3(l3Var, storeViewActivity, i), z11 ? 1 : 0), null, 1));
                m2.g0.D(aVar, context.getResources(), m2.j1.Copy, (m5.t0.d(l3Var.n().f37715b) || l3Var.f454g == null) ? false : true, new q2(new p3(b0Var, new e3(l3Var, storeViewActivity, i13), z11 ? 1 : 0), null, 1));
                m2.g0.D(aVar, context.getResources(), m2.j1.Paste, l3Var.j() && ((Boolean) l3Var.f469w.getValue()).booleanValue() && l3Var.f454g != null, new q2(new p3(b0Var, new e3(l3Var, storeViewActivity, i12), z11 ? 1 : 0), null, 1));
                m2.j1 j1Var = m2.j1.SelectAll;
                boolean z13 = m5.t0.e(l3Var.n().f37715b) != l3Var.n().f37714a.f29538b.length();
                final int i14 = z11 ? 1 : 0;
                m2.g0.D(aVar, context.getResources(), j1Var, z13, new q2(new Function0() { // from class: a3.q3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                break;
                            case 1:
                                l3 l3Var2 = l3Var;
                                r5.y yVarE = l3.e(l3Var2.n().f37714a, m5.k0.b(0, l3Var2.n().f37714a.f29538b.length()));
                                l3Var2.f450c.invoke(yVarE);
                                long j9 = yVarE.f37715b;
                                l3Var2.f468v = new m5.t0(j9);
                                l3Var2.f466t = r5.y.b(l3Var2.f466t, null, j9, 5);
                                l3Var2.h(true);
                                break;
                            default:
                                Function0 function0 = l3Var.f453f;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, new Function0() { // from class: a3.q3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                break;
                            case 1:
                                l3 l3Var2 = l3Var;
                                r5.y yVarE = l3.e(l3Var2.n().f37714a, m5.k0.b(0, l3Var2.n().f37714a.f29538b.length()));
                                l3Var2.f450c.invoke(yVarE);
                                long j9 = yVarE.f37715b;
                                l3Var2.f468v = new m5.t0(j9);
                                l3Var2.f466t = r5.y.b(l3Var2.f466t, null, j9, 5);
                                l3Var2.h(true);
                                break;
                            default:
                                Function0 function0 = l3Var.f453f;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, 1));
                m2.j1 j1Var2 = m2.j1.Autofill;
                if (l3Var.j() && m5.t0.d(l3Var.n().f37715b)) {
                    z11 = true;
                }
                m2.g0.D(aVar, context.getResources(), j1Var2, z11, new q2(new Function0() { // from class: a3.q3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                break;
                            case 1:
                                l3 l3Var2 = l3Var;
                                r5.y yVarE = l3.e(l3Var2.n().f37714a, m5.k0.b(0, l3Var2.n().f37714a.f29538b.length()));
                                l3Var2.f450c.invoke(yVarE);
                                long j9 = yVarE.f37715b;
                                l3Var2.f468v = new m5.t0(j9);
                                l3Var2.f466t = r5.y.b(l3Var2.f466t, null, j9, 5);
                                l3Var2.h(true);
                                break;
                            default:
                                Function0 function0 = l3Var.f453f;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, null, 1));
                aVar.a();
                return Unit.f26487a;
            case 2:
                StoreInformation storeInformation = (StoreInformation) obj3;
                Function2 function2 = (Function2) obj2;
                int i15 = bq.a.f6576c;
                ((View) obj).getClass();
                Context context2 = ((bq.a) obj4).getContext();
                storeViewActivity = context2 instanceof StoreViewActivity ? (StoreViewActivity) context2 : 0;
                if (storeViewActivity != 0) {
                    storeViewActivity.C().f48024b.c(cv.i.ACTION_FIND_STORE, h0.g.E(new Pair(dv.a.METHOD, new dv.c("Store_Address"))));
                }
                StoreLocation storeLocation = storeInformation.getStoreLocation();
                if (storeLocation.getAddress().getStreetAddress() != null && storeLocation.getLatLngInfo() != null) {
                    LatLngInfo latLngInfo = storeLocation.getLatLngInfo();
                    latLngInfo.getClass();
                    Double dValueOf = Double.valueOf(latLngInfo.getLatitude());
                    LatLngInfo latLngInfo2 = storeLocation.getLatLngInfo();
                    latLngInfo2.getClass();
                    function2.invoke(dValueOf, Double.valueOf(latLngInfo2.getLongitude()));
                }
                return Unit.f26487a;
            case 3:
                StoreInformation storeInformation2 = (StoreInformation) obj3;
                Function2 function22 = (Function2) obj2;
                int i16 = bq.c.f6580i;
                ((View) obj).getClass();
                Context context3 = ((bq.c) obj4).getContext();
                StoreViewActivity storeViewActivity = context3 instanceof StoreViewActivity ? (StoreViewActivity) context3 : null;
                if (storeViewActivity != null) {
                    storeViewActivity.C().f48024b.c(cv.i.ACTION_FIND_STORE, h0.g.E(new Pair(dv.a.METHOD, new dv.c("Map"))));
                }
                StoreLocation storeLocation2 = storeInformation2.getStoreLocation();
                if (storeLocation2.getAddress().getStreetAddress() != null && storeLocation2.getLatLngInfo() != null) {
                    LatLngInfo latLngInfo3 = storeLocation2.getLatLngInfo();
                    latLngInfo3.getClass();
                    Double dValueOf2 = Double.valueOf(latLngInfo3.getLatitude());
                    LatLngInfo latLngInfo4 = storeLocation2.getLatLngInfo();
                    latLngInfo4.getClass();
                    function22.invoke(dValueOf2, Double.valueOf(latLngInfo4.getLongitude()));
                }
                return Unit.f26487a;
            case 4:
                Fragment fragment = (Fragment) obj3;
                Context context4 = (Context) obj2;
                View view = (View) obj;
                Object tag = view.getTag(R.id.binding_reference);
                tag.getClass();
                ((Function1) obj4).invoke((sa.a) tag);
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    if (fragment == null || (childFragmentManager = fragment.getChildFragmentManager()) == null) {
                        androidx.fragment.app.o0 o0Var = context4 instanceof androidx.fragment.app.o0 ? (androidx.fragment.app.o0) context4 : null;
                        if (o0Var != null) {
                            supportFragmentManager = o0Var.getSupportFragmentManager();
                        }
                    } else {
                        supportFragmentManager = childFragmentManager;
                    }
                    c6.l.e(viewGroup, new c50.p(supportFragmentManager, i));
                }
                return Unit.f26487a;
            case 5:
                cn.a aVar2 = (cn.a) obj4;
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                f2.l.s(lVar, aVar2.f8464a.size(), new c50.p(aVar2, 4), new u3.d(new cn.v(aVar2, (Function2) obj3, (Function2) obj2, z11 ? 1 : 0), true, 1548251420), 4);
                return Unit.f26487a;
            case 6:
                return UserJavascriptInterfaceBase.setDateOfBirth$lambda$8((Integer) obj4, (Month) obj3, (Integer) obj2, (BrazeUser) obj);
            case 7:
                return UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$27((String) obj4, (Double) obj3, (Double) obj2, (BrazeUser) obj);
            case 8:
                cn.u uVar = (cn.u) obj2;
                Throwable th2 = (Throwable) obj;
                ((c50.p) obj4).invoke(th2);
                x80.i iVar = (x80.i) ((com.google.firebase.messaging.a0) obj3).f12781d;
                iVar.n(th2, false);
                while (true) {
                    Object objA = x80.p.a(iVar.d());
                    if (objA == null) {
                        return Unit.f26487a;
                    }
                    uVar.invoke(objA, th2);
                }
                break;
            case 9:
                ItemDetailsFaqItem itemDetailsFaqItem = (ItemDetailsFaqItem) obj3;
                bs.b bVar = (bs.b) obj2;
                ((View) obj).getClass();
                ArrayList arrayList = ((en.e) obj4).f16130e;
                if (!CollectionsKt.I(arrayList, itemDetailsFaqItem.getEventId()) && (eventId = itemDetailsFaqItem.getEventId()) != null) {
                    arrayList.add(eventId);
                }
                bVar.invoke();
                return Unit.f26487a;
            case 10:
                g9.f0 f0Var = (g9.f0) obj4;
                ep.d0 d0Var = (ep.d0) obj3;
                m3.b1 b1Var = (m3.b1) obj2;
                if (((Boolean) obj).booleanValue()) {
                    g9.p.f(f0Var, hp.o.INSTANCE.f22335a);
                } else {
                    b1Var.setValue(Boolean.TRUE);
                    d0Var.r(cv.i.ACTION_CLOSE_CAMERA_ACCESS, null);
                }
                return Unit.f26487a;
            case 11:
                Ref.FloatRef floatRef = (Ref.FloatRef) obj4;
                ka kaVar = (ka) obj3;
                t1.h hVar = (t1.h) obj;
                float fFloatValue = ((Number) hVar.f39447e.getValue()).floatValue() - floatRef.element;
                float fH = kaVar.f18985c.h();
                kaVar.b(fH + fFloatValue);
                float fAbs = Math.abs(fH - kaVar.f18985c.h());
                floatRef.element = ((Number) hVar.f39447e.getValue()).floatValue();
                ((Ref.FloatRef) obj2).element = ((Number) hVar.b()).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    hVar.a();
                }
                return Unit.f26487a;
            case 12:
                z4.m1 m1Var = (z4.m1) obj4;
                z4.w0 w0Var = (z4.w0) obj3;
                z4.m1 m1Var2 = (z4.m1) obj2;
                z4.l1 l1Var = (z4.l1) obj;
                i = m1Var.f47183a <= w0Var.q0(l3.g.f26959b) ? 0 : 1;
                float f11 = i != 0 ? g3.k.f18924a : g3.k.f18926c;
                float f12 = i != 0 ? g3.k.f18925b : g3.k.f18926c;
                z4.l1.o(l1Var, m1Var2, 0, 0);
                z4.l1.o(l1Var, m1Var, Math.min(m1Var2.f47183a - w0Var.q0(f11), ((int) l1Var.c(g3.k.f18928e, Float.POSITIVE_INFINITY)) - m1Var.f47183a), Math.max(w0Var.q0(f12) + (-m1Var.f47184b), (int) l1Var.c(g3.k.f18927d, Float.NEGATIVE_INFINITY)));
                return Unit.f26487a;
            case 13:
                d2.z1 z1Var = (d2.z1) obj3;
                b4.e eVar = (b4.e) obj2;
                b5.o0 o0Var2 = (b5.o0) obj;
                long j9 = ((h4.e) ((i3.m0) obj4).invoke()).f21392a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fC0 = o0Var2.c0(z4.f19883a);
                    k4.b bVar2 = o0Var2.f5908a;
                    float fA = eVar.a(j80.c.b(fIntBitsToFloat), j80.c.b((Float.intBitsToFloat((int) (bVar2.d() >> 32)) - r12) - o0Var2.c0(z1Var.b(o0Var2.getLayoutDirection()))), o0Var2.getLayoutDirection()) + o0Var2.c0(z1Var.d(o0Var2.getLayoutDirection()));
                    float f13 = 2;
                    float f14 = fIntBitsToFloat / f13;
                    float f15 = fA + f14;
                    float f16 = (f15 - f14) - fC0;
                    float f17 = f16 < 0.0f ? 0.0f : f16;
                    float f18 = f15 + f14 + fC0;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar2.d() >> 32));
                    float f19 = f18 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f18;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & j9));
                    float f20 = (-fIntBitsToFloat3) / f13;
                    float f21 = fIntBitsToFloat3 / f13;
                    j30.g gVar = bVar2.f25938b;
                    long jO = gVar.o();
                    gVar.i().e();
                    try {
                        ((jd.f) gVar.f24502b).d(f17, f20, f19, f21, 0);
                        o0Var2.b();
                    } finally {
                        r8.k.y(gVar, jO);
                    }
                } else {
                    o0Var2.b();
                }
                return Unit.f26487a;
            case 14:
                return new u7((v7) obj, (z5.c) obj4, (Function1) obj3, (Function1) obj2);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ImageMessageContainerAdapterDelegate.ViewHolder.renderContent$lambda$0((ImageMessageContainerAdapterDelegate.ViewHolder) obj4, (MessageLogEntry.ImageMessageContainer) obj3, (Function1) obj2, (Message) obj);
            case 16:
                return QuickReplyAdapterDelegate.ViewHolder.bind$lambda$4((MessageLogEntry.QuickReply) obj4, (QuickReplyAdapterDelegate.ViewHolder) obj3, (Function1) obj2, (QuickReplyRendering) obj);
            case 17:
                return TextMessageContainerAdapterDelegate.ViewHolder.renderContent$lambda$0((TextMessageContainerAdapterDelegate.ViewHolder) obj4, (MessageLogEntry.TextMessageContainer) obj3, (Function1) obj2, (Message) obj);
            case 18:
                n4.b bVar3 = (n4.b) obj4;
                n4.b bVar4 = (n4.b) obj3;
                n4.b bVar5 = (n4.b) obj2;
                gd.h hVar2 = (gd.h) obj;
                if (hVar2 instanceof gd.f) {
                    return bVar3 != null ? new gd.f(bVar3) : (gd.f) hVar2;
                }
                if (!(hVar2 instanceof gd.e)) {
                    return hVar2;
                }
                gd.e eVar2 = (gd.e) hVar2;
                td.d dVar = eVar2.f20368b;
                return dVar.f39956c instanceof NullRequestDataException ? bVar4 != null ? new gd.e(bVar4, dVar) : eVar2 : bVar5 != null ? new gd.e(bVar5, dVar) : eVar2;
            case 19:
                Void r02 = (Void) obj;
                ((i1.d) obj4).e((m0.w) obj3, v0.c.a((Context) obj2));
                return r02;
            case 20:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj4;
                androidx.lifecycle.s sVar = new androidx.lifecycle.s((Function1) obj3, i12);
                lifecycleOwner.getLifecycle().a(sVar);
                return new i3.a((Function0) obj2, lifecycleOwner, sVar, z11 ? 1 : 0);
            case 21:
                v80.f0.B((v80.b0) obj4, null, null, new h2.a0((g4.z) obj, (m3.b1) obj3, (ea) obj2, null, 8), 3);
                return Unit.f26487a;
            case 22:
                j5.z.f((j5.b0) obj, (String) obj4, new i2.e(i13, (v80.b0) obj3, (ea) obj2));
                return Unit.f26487a;
            case 23:
                i3.s sVar2 = (i3.s) obj3;
                z4.m1 m1Var3 = (z4.m1) obj2;
                z4.l1 l1Var2 = (z4.l1) obj;
                boolean Z = ((z4.w0) obj4).Z();
                z1.r rVar = sVar2.f23178o;
                float f22 = Z ? ((z1.a0) rVar.d()).f(sVar2.f23178o.f46654i.getValue()) : rVar.g();
                float f23 = (b5.m.g(sVar2).A == z5.m.Rtl && sVar2.f23180q == z1.h2.Horizontal) ? -1.0f : 1.0f;
                z1.h2 h2Var = sVar2.f23180q;
                float f24 = h2Var == z1.h2.Horizontal ? f23 * f22 : 0.0f;
                if (h2Var != z1.h2.Vertical) {
                    f22 = 0.0f;
                }
                l1Var2.f47177a = true;
                l1Var2.j(m1Var3, j80.c.b(f24), j80.c.b(f22), 0.0f);
                l1Var2.f47177a = false;
                return Unit.f26487a;
            case 24:
                z3.r rVar2 = (z3.r) obj4;
                g9.l lVar2 = (g9.l) obj3;
                rVar2.add(lVar2);
                return new i3.a((i9.p) obj2, lVar2, rVar2, i);
            case 25:
                j1.c cVar = new j1.c((l1.d) obj4);
                ((Function1) obj3).invoke(cVar);
                ((k1.b) obj).f25717b = new a70.b(cVar, (m3.b1) obj2, (x70.c) storeViewActivity, i13);
                return Unit.f26487a;
            case 26:
                Surface surface = (Surface) obj3;
                ((m1.g) ((k1.c) obj4).f25722d).b();
                if (!Intrinsics.areEqual(surface, (Surface) obj2)) {
                    surface.release();
                }
                return Unit.f26487a;
            case 27:
                k9.g gVar2 = (k9.g) obj4;
                Fragment fragment2 = (Fragment) obj3;
                g9.l lVar3 = (g9.l) obj2;
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) obj;
                ArrayList arrayList2 = gVar2.f26192g;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.areEqual(((Pair) it.next()).f26485a, fragment2.getTag())) {
                                z12 = true;
                            }
                        }
                    }
                }
                if (lifecycleOwner2 != null && !z12) {
                    Lifecycle lifecycle = fragment2.getViewLifecycleOwner().getLifecycle();
                    if (lifecycle.b().a(Lifecycle.State.CREATED)) {
                        lifecycle.a((androidx.lifecycle.d0) gVar2.f26194i.invoke(lVar3));
                    }
                }
                return Unit.f26487a;
            case 28:
                return ComplexStorage.set$lambda$1((ComplexStorage) obj4, obj3, (Class) obj2, (FileWriter) obj);
            default:
                Function1 function1 = (Function1) obj4;
                m3.b1 b1Var2 = (m3.b1) obj2;
                r5.y yVar = (r5.y) obj;
                ((m3.b1) obj3).setValue(yVar);
                boolean zAreEqual = Intrinsics.areEqual((String) b1Var2.getValue(), yVar.f37714a.f29538b);
                m5.h hVar3 = yVar.f37714a;
                b1Var2.setValue(hVar3.f29538b);
                if (!zAreEqual) {
                    function1.invoke(hVar3.f29538b);
                }
                return Unit.f26487a;
        }
    }
}
