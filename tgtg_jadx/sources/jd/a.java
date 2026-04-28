package jd;

import a3.k1;
import a3.l1;
import a3.t;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.widget.Toast;
import androidx.core.util.Consumer;
import androidx.lifecycle.m1;
import cn.n;
import com.app.tgtg.R;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.app.tgtg.feature.login.optin.OptInActivity;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.loyaltycardpromo.DiscoverLoyaltyCardPromoView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters.QuickFilterView;
import com.app.tgtg.model.remote.item.QuickFilter;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.braze.storage.u3;
import ek.q;
import g9.l;
import i2.x;
import i3.u;
import j5.a0;
import j5.b0;
import j5.z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import lq.m;
import m2.c2;
import m2.t0;
import m2.y1;
import m3.a1;
import m3.b2;
import m3.c1;
import m3.g0;
import m3.g1;
import m3.z0;
import m3.z1;
import mv.r0;
import org.bouncycastle.iana.AEADAlgorithm;
import q1.u0;
import v80.f0;
import v80.i1;
import z3.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24952b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f24951a = i11;
        this.f24952b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k1.c cVar;
        int i11 = 4;
        int i12 = 0;
        x70.c cVar2 = null;
        switch (this.f24951a) {
            case 0:
                ((e) this.f24952b).l = true;
                return Unit.f26487a;
            case 1:
                XmlCheckoutAddressFragment xmlCheckoutAddressFragment = (XmlCheckoutAddressFragment) this.f24952b;
                if (((Boolean) obj).booleanValue()) {
                    xmlCheckoutAddressFragment.z().a();
                    xmlCheckoutAddressFragment.x().c();
                }
                return Unit.f26487a;
            case 2:
                ((DiscoverLoyaltyCardPromoView) this.f24952b).f9285j.invoke((LoyaltyCardDetails) obj);
                return Unit.f26487a;
            case 3:
                ((jq.b) this.f24952b).f25364f.invoke((LoyaltyCardDetails) obj);
                return Unit.f26487a;
            case 4:
                jt.h hVar = (jt.h) this.f24952b;
                n90.h hVar2 = (n90.h) obj;
                hVar2.getClass();
                hVar2.f30765b = false;
                hVar2.f30766c = true;
                x xVar = hVar.f25411e;
                xVar.getClass();
                hVar2.f30768e = xVar;
                return Unit.f26487a;
            case 5:
                k1.c cVar3 = (k1.c) this.f24952b;
                ((Surface) obj).release();
                ((SurfaceTexture) cVar3.f25722d).release();
                return Unit.f26487a;
            case 6:
                k1.e eVar = (k1.e) this.f24952b;
                k1.d dVar = (k1.d) obj;
                TextureView.SurfaceTextureListener surfaceTextureListener = dVar.getSurfaceTextureListener();
                if ((surfaceTextureListener instanceof k1.e ? (k1.e) surfaceTextureListener : null) != null && (cVar = eVar.f25724e) != null && !cVar.f25721c) {
                    cVar.f25720b.c();
                    cVar.f25721c = true;
                }
                dVar.setSurfaceTextureListener(null);
                return Unit.f26487a;
            case 7:
                u uVar = (u) this.f24952b;
                b0 b0Var = (b0) obj;
                if (uVar.invoke() > 0.0f) {
                    j5.i iVar = new j5.i(uVar.invoke(), new n80.f(1.0f));
                    KProperty[] kPropertyArr = z.f24734a;
                    a0 a0Var = j5.x.f24709c;
                    KProperty kProperty = z.f24734a[1];
                    b0Var.b(a0Var, iVar);
                }
                return Unit.f26487a;
            case 8:
                k9.g gVar = (k9.g) this.f24952b;
                l lVar = (l) obj;
                lVar.getClass();
                return new androidx.activity.e(2, gVar, lVar);
            case 9:
                ih.i iVar2 = (ih.i) this.f24952b;
                mq.a aVar = (mq.a) obj;
                aVar.getClass();
                iVar2.getClass();
                mv.d.u(m1.d(iVar2), new gf.g(iVar2, (Item) aVar, cVar2, 13));
                return Unit.f26487a;
            case 10:
                return obj == ((kotlin.collections.a) this.f24952b) ? "(this Collection)" : String.valueOf(obj);
            case 11:
                k kVar = (k) this.f24952b;
                Map.Entry entry = (Map.Entry) obj;
                kotlin.collections.g gVar2 = k.f26515c;
                entry.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                sb2.append(key == kVar ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                sb2.append(value != kVar ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 12:
                return TypeReference.asString$lambda$0((TypeReference) this.f24952b, (KTypeProjection) obj);
            case 13:
                return ((j) this.f24952b).d(((Integer) obj).intValue());
            case 14:
                return QuickFilterView.i((QuickFilterView) this.f24952b, (QuickFilter) obj);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                li.g gVar3 = (li.g) this.f24952b;
                mi.b bVar = (mi.b) obj;
                bVar.getClass();
                gVar3.getClass();
                f0.B(m1.d(gVar3), null, null, new bn.e(gVar3, bVar, cVar2, i11), 3);
                return Unit.f26487a;
            case 16:
                q qVar = (q) this.f24952b;
                f2.l lVar2 = (f2.l) obj;
                lVar2.getClass();
                List list = qVar.f16074j;
                lVar2.r(list.size(), null, new n(list, 10), new u3.d(new lk.b(qVar, list, i12), true, 802480018));
                return Unit.f26487a;
            case 17:
                OptInActivity optInActivity = (OptInActivity) this.f24952b;
                int i13 = OptInActivity.f9058k;
                ((Throwable) obj).getClass();
                Toast.makeText(optInActivity, R.string.generic_error_servers_are_busy, 0).show();
                optInActivity.finish();
                return Unit.f26487a;
            case 18:
                lq.h hVar3 = (lq.h) this.f24952b;
                ((BasicItem) obj).getClass();
                hVar3.a();
                return Unit.f26487a;
            case 19:
                lq.k kVar2 = (lq.k) this.f24952b;
                ((BasicItem) obj).getClass();
                m mVar = kVar2.f28133a;
                Context context = mVar.getContext();
                context.getClass();
                if (r0.u(context)) {
                    Consumer consumer = kVar2.f28134b.f28139d;
                    if (consumer != null) {
                        consumer.accept(mVar);
                    }
                } else {
                    Toast.makeText(mVar.getContext(), mVar.getContext().getString(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later), 0).show();
                }
                return Unit.f26487a;
            case 20:
                return u3.a((u3) this.f24952b, (String) obj);
            case 21:
                ((b0) obj).b(a3.m1.f480c, new l1(t0.Cursor, ((t) this.f24952b).a(), k1.Middle, true));
                return Unit.f26487a;
            case 22:
                y1 y1Var = (y1) this.f24952b;
                float fFloatValue = ((Float) obj).floatValue();
                g1 g1Var = y1Var.f29139a;
                float fH = g1Var.h() + fFloatValue;
                g1 g1Var2 = y1Var.f29140b;
                if (fH > g1Var2.h()) {
                    fFloatValue = g1Var2.h() - g1Var.h();
                } else if (fH < 0.0f) {
                    fFloatValue = -g1Var.h();
                }
                g1Var.i(g1Var.h() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 23:
                return Integer.valueOf(((z0) this.f24952b).f29492a.b(((a1) obj).f29202e));
            case 24:
                return Boolean.valueOf(Intrinsics.areEqual(((c1) obj).f29254b, (a1) this.f24952b));
            case 25:
                ((m3.a0) ((g0) this.f24952b)).b(obj);
                return Unit.f26487a;
            case 26:
                b2 b2Var = (b2) this.f24952b;
                Throwable th2 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th2);
                synchronized (b2Var.f29227c) {
                    try {
                        i1 i1Var = b2Var.f29228d;
                        if (i1Var != null) {
                            b2Var.f29244u.j(z1.ShuttingDown);
                            i1Var.a(cancellationException);
                            b2Var.f29241r = null;
                            i1Var.J(new c2(i11, b2Var, th2));
                        } else {
                            b2Var.f29229e = cancellationException;
                            b2Var.f29244u.j(z1.ShutDown);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return Unit.f26487a;
            case 27:
                ((m3.i1) this.f24952b).i(((Long) obj).longValue());
                return Unit.f26487a;
            case 28:
                ((m3.k1) this.f24952b).setValue(obj);
                return Unit.f26487a;
            default:
                u0 u0Var = (u0) this.f24952b;
                if (obj instanceof e0) {
                    ((e0) obj).g(4);
                }
                u0Var.d(obj);
                return Unit.f26487a;
        }
    }
}
