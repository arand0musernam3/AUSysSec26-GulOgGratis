package defpackage;

import android.support.v4.media.session.a;
import b4.t;
import cg.j;
import com.app.tgtg.model.local.SnackBarInfo;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import on.d;
import on.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20934e;

    public /* synthetic */ h(int i11, e eVar, Function2 function2, int i12) {
        this.f20930a = 2;
        this.f20931b = i11;
        this.f20933d = eVar;
        this.f20934e = function2;
        this.f20932c = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20930a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = i.F(3457);
                a.h(this.f20931b, this.f20932c, (Function1) this.f20933d, (Function0) this.f20934e, (n) obj, iF);
                break;
            case 1:
                ((Integer) obj2).getClass();
                j.l((t) this.f20933d, (SnackBarInfo) this.f20934e, (n) obj, i.F(this.f20931b | 1), this.f20932c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iF2 = i.F(this.f20932c | 1);
                d.a(this.f20931b, (e) this.f20933d, (Function2) this.f20934e, (n) obj, iF2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iF3 = i.F(1);
                rn.a.a((ProfileFeatureType) this.f20933d, (ProfileFeatureState) this.f20934e, this.f20931b, this.f20932c, (n) obj, iF3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iF4 = i.F(1);
                u00.d.h((t) this.f20933d, (ProfileFeatureState) this.f20934e, this.f20931b, this.f20932c, (n) obj, iF4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF5 = i.F(1);
                us.a.y(this.f20931b, this.f20932c, (String) this.f20933d, (String) this.f20934e, (n) obj, iF5);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ h(int i11, int i12, Object obj, Object obj2, int i13, int i14) {
        this.f20930a = i14;
        this.f20931b = i11;
        this.f20932c = i12;
        this.f20933d = obj;
        this.f20934e = obj2;
    }

    public /* synthetic */ h(t tVar, SnackBarInfo snackBarInfo, int i11, int i12) {
        this.f20930a = 1;
        this.f20933d = tVar;
        this.f20934e = snackBarInfo;
        this.f20931b = i11;
        this.f20932c = i12;
    }

    public /* synthetic */ h(Object obj, ProfileFeatureState profileFeatureState, int i11, int i12, int i13, int i14) {
        this.f20930a = i14;
        this.f20933d = obj;
        this.f20934e = profileFeatureState;
        this.f20931b = i11;
        this.f20932c = i12;
    }
}
