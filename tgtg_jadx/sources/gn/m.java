package gn;

import com.app.tgtg.model.remote.item.response.HeroComponentResponse;
import kotlin.jvm.functions.Function0;
import mv.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HeroComponentResponse f20631b;

    public /* synthetic */ m(HeroComponentResponse heroComponentResponse, int i11) {
        this.f20630a = i11;
        this.f20631b = heroComponentResponse;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20630a) {
            case 0:
                String backgroundColor = this.f20631b.getBackgroundColor();
                if (backgroundColor == null) {
                    backgroundColor = "";
                }
                return new i4.v(r0.g(backgroundColor));
            case 1:
                String titlePrimaryColor = this.f20631b.getTitlePrimaryColor();
                if (titlePrimaryColor == null) {
                    titlePrimaryColor = "";
                }
                return new i4.v(r0.g(titlePrimaryColor));
            default:
                String titleSecondaryColor = this.f20631b.getTitleSecondaryColor();
                if (titleSecondaryColor == null) {
                    titleSecondaryColor = "";
                }
                return new i4.v(r0.g(titleSecondaryColor));
        }
    }
}
