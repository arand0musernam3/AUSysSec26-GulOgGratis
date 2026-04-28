package cy;

import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements ax.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f13500b;

    public /* synthetic */ f(k kVar, int i11) {
        this.f13499a = i11;
        this.f13500b = kVar;
    }

    @Override // ax.c0
    public final void a(ax.k0 k0Var) {
        switch (this.f13499a) {
            case 0:
                k kVar = this.f13500b;
                k0Var.getClass();
                if (!kVar.f13521e.get()) {
                    ax.w wVar = k0Var.f4943c;
                    if (wVar != null) {
                        int i11 = wVar.f5020c;
                        if (i11 == 1349174 || i11 == 1349172) {
                            kVar.v();
                        } else if (i11 == 1349152) {
                            i iVar = kVar.f13524h;
                            if (iVar != null) {
                                sx.b.a(iVar.f13513b);
                            }
                            r rVar = kVar.f13527k;
                            if (rVar == null) {
                                kVar.r();
                            } else {
                                kVar.x(rVar);
                            }
                        } else if (i11 != 1349173) {
                            FacebookException facebookException = wVar.f5026i;
                            if (facebookException == null) {
                                facebookException = new FacebookException();
                            }
                            kVar.s(facebookException);
                        } else {
                            kVar.r();
                        }
                    } else {
                        try {
                            JSONObject jSONObject = k0Var.f4942b;
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            String string = jSONObject.getString("access_token");
                            string.getClass();
                            kVar.t(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        } catch (JSONException e5) {
                            kVar.s(new FacebookException(e5));
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                k kVar2 = this.f13500b;
                k0Var.getClass();
                if (!kVar2.f13525i) {
                    ax.w wVar2 = k0Var.f4943c;
                    if (wVar2 != null) {
                        FacebookException facebookException2 = wVar2.f5026i;
                        if (facebookException2 == null) {
                            facebookException2 = new FacebookException();
                        }
                        kVar2.s(facebookException2);
                    } else {
                        JSONObject jSONObject2 = k0Var.f4942b;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        i iVar2 = new i();
                        try {
                            String string2 = jSONObject2.getString("user_code");
                            iVar2.f13513b = string2;
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            iVar2.f13512a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string2}, 1));
                            iVar2.f13514c = jSONObject2.getString("code");
                            iVar2.f13515d = jSONObject2.getLong("interval");
                            kVar2.w(iVar2);
                        } catch (JSONException e11) {
                            kVar2.s(new FacebookException(e11));
                        }
                    }
                    break;
                }
                break;
        }
    }
}
