package im;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import b5.o0;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.loyaltycardpromo.DiscoverLoyaltyCardPromoView;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.user.response.AddressField;
import com.app.tgtg.model.remote.user.response.AddressViolation;
import g2.x;
import ia0.a0;
import j5.b0;
import j5.z;
import ja0.j;
import ja0.l;
import k1.d;
import k1.g;
import k3.t;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.reflect.KProperty;
import n20.f;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.q;
import r8.k;
import w0.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24068a;

    public /* synthetic */ a(int i11) {
        this.f24068a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k1.c cVar;
        switch (this.f24068a) {
            case 0:
                ((CorruptionException) obj).getClass();
                return e.o();
            case 1:
                ((CorruptionException) obj).getClass();
                return e.o();
            case 2:
                q qVar = (q) obj;
                qVar.getClass();
                qVar.f35078b.getFragment();
                return Unit.f26487a;
            case 3:
                Pair pair = (Pair) obj;
                pair.getClass();
                return (CharSequence) pair.f26486b;
            case 4:
                l lVar = (l) obj;
                lVar.getClass();
                a0 a0Var = j.f24812f;
                return Boolean.valueOf(f.l(lVar.f24817a));
            case 5:
                ((l) obj).getClass();
                return Boolean.TRUE;
            case 6:
                AddressViolation addressViolation = (AddressViolation) obj;
                return Boolean.valueOf((addressViolation != null ? addressViolation.getField() : null) == AddressField.STATE);
            case 7:
                AddressViolation addressViolation2 = (AddressViolation) obj;
                return Boolean.valueOf((addressViolation2 != null ? addressViolation2.getField() : null) == AddressField.STATE);
            case 8:
                AddressViolation addressViolation3 = (AddressViolation) obj;
                return Boolean.valueOf((addressViolation3 != null ? addressViolation3.getField() : null) == AddressField.PHONE_NUMBER);
            case 9:
                AddressViolation addressViolation4 = (AddressViolation) obj;
                return Boolean.valueOf((addressViolation4 != null ? addressViolation4.getField() : null) == AddressField.STATE);
            case 10:
                AddressViolation addressViolation5 = (AddressViolation) obj;
                return Boolean.valueOf((addressViolation5 != null ? addressViolation5.getField() : null) == AddressField.EMAIL);
            case 11:
                AddressViolation addressViolation6 = (AddressViolation) obj;
                return Boolean.valueOf((addressViolation6 != null ? addressViolation6.getField() : null) == AddressField.EMAIL);
            case 12:
                AddressViolation addressViolation7 = (AddressViolation) obj;
                return Boolean.valueOf((addressViolation7 != null ? addressViolation7.getField() : null) == AddressField.NAME);
            case 13:
                AddressViolation addressViolation8 = (AddressViolation) obj;
                return Boolean.valueOf((addressViolation8 != null ? addressViolation8.getField() : null) == AddressField.NAME);
            case 14:
                AddressViolation addressViolation9 = (AddressViolation) obj;
                return Boolean.valueOf((addressViolation9 != null ? addressViolation9.getField() : null) == AddressField.PHONE_COUNTRY_CODE);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((x) obj).getClass();
                return new g2.b(f0.g(3));
            case 16:
                ((x) obj).getClass();
                return new g2.b(f0.g(3));
            case 17:
                ((x) obj).getClass();
                return new g2.b(f0.g(3));
            case 18:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                z.h("", b0Var);
                return Unit.f26487a;
            case 19:
                int i11 = DiscoverLoyaltyCardPromoView.l;
                return Unit.f26487a;
            case 20:
                int i12 = jq.b.f25363i;
                return Unit.f26487a;
            case 21:
                sa0.a.f38953a.c("Failed to determine subtype! Defaulting to Item::class ", new Object[0]);
                return Item.INSTANCE.serializer();
            case 22:
                return new d((Context) obj);
            case 23:
                return new k1.f((Context) obj);
            case 24:
                k1.f fVar = (k1.f) obj;
                g attachedState = fVar.getAttachedState();
                if (attachedState != null && (cVar = attachedState.f25729g) != null && !cVar.f25721c) {
                    ((m1.g) cVar.f25722d).b();
                    cVar.f25720b.c();
                    cVar.f25721c = true;
                }
                fVar.setAttachedState(null);
                return Unit.f26487a;
            case 25:
                KProperty[] kPropertyArr = z.f24734a;
                j5.a0 a0Var2 = j5.x.f24711e;
                Unit unit = Unit.f26487a;
                ((b0) obj).b(a0Var2, unit);
                return unit;
            case 26:
                o0 o0Var = (o0) obj;
                j30.g gVar = o0Var.f5908a.f25938b;
                long jO = gVar.o();
                gVar.i().e();
                try {
                    ((jd.f) gVar.f24502b).d(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    o0Var.b();
                    k.y(gVar, jO);
                    return Unit.f26487a;
                } catch (Throwable th2) {
                    k.y(gVar, jO);
                    throw th2;
                }
            case 27:
                Float f11 = (Float) obj;
                f11.getClass();
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                return new t(new t1.b(f11, t1.c.f39389j, addressField, 12));
            case 28:
                ((b0) obj).getClass();
                return Unit.f26487a;
            default:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                return (String) pair2.f26485a;
        }
    }
}
