package com.braze.ui;

import android.net.Uri;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.support.BrazeImageUtils;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f10906b;

    public /* synthetic */ b(Uri uri, int i11) {
        this.f10905a = i11;
        this.f10906b = uri;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10905a) {
            case 0:
                return BrazeWebViewClient.handleQueryAction$lambda$10(this.f10906b);
            case 1:
                return BrazeWebViewClient.handleUrlOverride$lambda$8(this.f10906b);
            case 2:
                return BrazeImageUtils.getLocalBitmap$lambda$9(this.f10906b);
            case 3:
                return BrazeImageUtils.getBitmap$lambda$7(this.f10906b);
            case 4:
                return BrazeImageUtils.getLocalBitmap$lambda$8(this.f10906b);
            case 5:
                return UriAction.openUriWithActionViewFromPush$lambda$6(this.f10906b);
            case 6:
                return BrazeActionParser.getBrazeActionVersionAndJson$lambda$7(this.f10906b);
            case 7:
                return BrazeActionParser.execute$lambda$3(this.f10906b);
            case 8:
                return BrazeActionParser.execute$lambda$4(this.f10906b);
            default:
                return DefaultBrazeImageLoader.shouldSkipCaching$lambda$3(this.f10906b);
        }
    }
}
