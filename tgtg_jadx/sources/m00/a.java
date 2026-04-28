package m00;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends com.google.android.gms.common.api.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.api.h f28650b = new com.google.android.gms.common.api.h("LocationServices.API", new a10.b(8), new com.google.android.gms.common.api.g());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28651a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, Activity activity, com.google.android.gms.common.api.h hVar, com.google.android.gms.common.api.d dVar, com.google.android.gms.common.api.k kVar, int i11) {
        super(context, activity, hVar, dVar, kVar);
        this.f28651a = i11;
    }

    @Override // com.google.android.gms.common.api.l
    public String getApiFallbackAttributionTag(Context context) {
        switch (this.f28651a) {
            case 0:
                return null;
            default:
                return super.getApiFallbackAttributionTag(context);
        }
    }
}
