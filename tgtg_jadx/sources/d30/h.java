package d30;

import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14025a;

    public h(String str) {
        this.f14025a = str;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f14025a;
    }
}
