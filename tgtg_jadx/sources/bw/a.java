package bw;

import com.braze.communication.dust.i;
import com.braze.enums.CardKey;
import com.braze.managers.c1;
import com.braze.models.dust.e;
import com.braze.models.response.g;
import com.braze.models.response.m;
import com.braze.storage.p;
import com.braze.storage.u3;
import com.braze.support.d;
import com.braze.support.n;
import com.braze.support.o;
import com.braze.support.s;
import com.braze.triggers.actions.c;
import com.braze.triggers.actions.f;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f6705b;

    public /* synthetic */ a(JSONObject jSONObject, int i11) {
        this.f6704a = i11;
        this.f6705b = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6704a) {
            case 0:
                return e.b(this.f6705b);
            case 1:
                return com.braze.models.a.b(this.f6705b);
            case 2:
                return g.a(this.f6705b);
            case 3:
                return g.b(this.f6705b);
            case 4:
                return m.k(this.f6705b);
            case 5:
                return p.d(this.f6705b);
            case 6:
                return p.e(this.f6705b);
            case 7:
                return p.b(this.f6705b);
            case 8:
                return p.c(this.f6705b);
            case 9:
                return u3.a("ab_install_attribution", this.f6705b);
            case 10:
                return d.d(this.f6705b);
            case 11:
                return n.b(this.f6705b);
            case 12:
                return o.b(this.f6705b);
            case 13:
                return o.a(this.f6705b);
            case 14:
                return s.a(this.f6705b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return s.b(this.f6705b);
            case 16:
                return s.c(this.f6705b);
            case 17:
                return c.a(this.f6705b);
            case 18:
                return f.a(this.f6705b);
            case 19:
                return i.a(this.f6705b);
            case 20:
                return com.braze.triggers.utils.c.a(this.f6705b);
            case 21:
                return com.braze.triggers.utils.c.b(this.f6705b);
            case 22:
                return CardKey.Companion.getCardTypeFromJson$lambda$0(this.f6705b);
            default:
                return c1.a(this.f6705b);
        }
    }
}
