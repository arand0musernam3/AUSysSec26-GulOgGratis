package bg;

import android.content.res.Resources;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.R;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.privacyaction.PrivacyActionActivity;
import pg.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements he.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6251b;

    public /* synthetic */ y(Object obj, int i11) {
        this.f6250a = i11;
        this.f6251b = obj;
    }

    @Override // he.c0
    public final void onResult(Object obj) {
        int i11 = this.f6250a;
        Object obj2 = this.f6251b;
        switch (i11) {
            case 0:
                int i12 = GenericErrorView.f8906b;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ((pg.c) obj2).f34804e;
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.setComposition((he.k) obj);
                lottieAnimationView.e();
                break;
            case 1:
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) obj2;
                lottieAnimationView2.setComposition((he.k) obj);
                lottieAnimationView2.e();
                break;
            case 2:
                TGTGLoadingView tGTGLoadingView = (TGTGLoadingView) obj2;
                he.k kVar = (he.k) obj;
                int i13 = TGTGLoadingView.f8922p;
                kVar.getClass();
                tGTGLoadingView.setComposition(kVar);
                tGTGLoadingView.setRepeatMode(1);
                tGTGLoadingView.setRepeatCount(-1);
                Resources resources = tGTGLoadingView.getContext().getResources();
                ThreadLocal threadLocal = w6.j.f43256a;
                tGTGLoadingView.setBackground(resources.getDrawable(R.drawable.loading_bg, null));
                tGTGLoadingView.f8861k.add(he.i.PLAY_OPTION);
                tGTGLoadingView.f8855e.o();
                break;
            case 3:
                pg.b bVar = ((EmailCodeAccessActivity) obj2).f9050g;
                bVar.getClass();
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) bVar.f34782c;
                lottieAnimationView3.setComposition((he.k) obj);
                lottieAnimationView3.setRepeatCount(1);
                lottieAnimationView3.e();
                break;
            case 4:
                int i14 = PrivacyActionActivity.f9330k;
                LottieAnimationView lottieAnimationView4 = (LottieAnimationView) ((s1) obj2).f35149c;
                lottieAnimationView4.setComposition((he.k) obj);
                lottieAnimationView4.e();
                break;
            default:
                int i15 = lq.p.f28154j;
                LottieAnimationView lottieAnimationView5 = ((pg.w0) obj2).f35235f;
                lottieAnimationView5.setComposition((he.k) obj);
                lottieAnimationView5.e();
                break;
        }
    }
}
