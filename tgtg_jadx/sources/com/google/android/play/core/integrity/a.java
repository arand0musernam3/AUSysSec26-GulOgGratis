package com.google.android.play.core.integrity;

import c50.w;
import com.braze.h2;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import d30.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f12748b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f12747a;
        if (str != null) {
            return new g(str, this.f12748b);
        }
        h2.b("Missing required properties: nonce");
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j9) {
        this.f12748b = Long.valueOf(j9);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.f12747a = str;
            return this;
        }
        w.l("Null nonce");
        return null;
    }
}
