package cn;

import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.user.response.charity.CharityHomePartnerStore;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8495f;

    public /* synthetic */ d(b4.t tVar, boolean z11, int i11, Function0 function0, int i12, int i13) {
        this.f8490a = 2;
        this.f8494e = tVar;
        this.f8491b = z11;
        this.f8492c = i11;
        this.f8495f = function0;
        this.f8493d = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8490a) {
            case 0:
                ((Integer) obj2).getClass();
                jb.u.s((BasketManager) this.f8494e, (String) this.f8495f, this.f8492c, this.f8491b, (m3.n) obj, m3.i.F(this.f8493d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                oi.a.a((CharityHomePartnerStore) this.f8494e, (b4.t) this.f8495f, this.f8491b, (m3.n) obj, m3.i.F(this.f8492c | 1), this.f8493d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(49);
                oo.a.q((b4.t) this.f8494e, this.f8491b, this.f8492c, (Function0) this.f8495f, (m3.n) obj, iF, this.f8493d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ug.c.f((b4.t) this.f8494e, (tg.i) this.f8495f, this.f8491b, (m3.n) obj, m3.i.F(this.f8492c | 1), this.f8493d);
                break;
            default:
                ((Integer) obj2).intValue();
                PantryThemeKt.PantryTheme(this.f8491b, (Locale) this.f8494e, (Function2) this.f8495f, (m3.n) obj, m3.i.F(this.f8492c | 1), this.f8493d);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(BasketManager basketManager, String str, int i11, boolean z11, int i12) {
        this.f8490a = 0;
        this.f8494e = basketManager;
        this.f8495f = str;
        this.f8492c = i11;
        this.f8491b = z11;
        this.f8493d = i12;
    }

    public /* synthetic */ d(Object obj, Object obj2, boolean z11, int i11, int i12, int i13) {
        this.f8490a = i13;
        this.f8494e = obj;
        this.f8495f = obj2;
        this.f8491b = z11;
        this.f8492c = i11;
        this.f8493d = i12;
    }

    public /* synthetic */ d(boolean z11, Locale locale, Function2 function2, int i11, int i12) {
        this.f8490a = 4;
        this.f8491b = z11;
        this.f8494e = locale;
        this.f8495f = function2;
        this.f8492c = i11;
        this.f8493d = i12;
    }
}
