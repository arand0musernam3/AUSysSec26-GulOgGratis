package com.braze;

import com.braze.models.outgoing.BrazeProperties;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BrazeProperties f9946c;

    public /* synthetic */ m1(String str, BrazeProperties brazeProperties, int i11) {
        this.f9944a = i11;
        this.f9945b = str;
        this.f9946c = brazeProperties;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9944a) {
            case 0:
                return Braze.logCustomEvent$lambda$50$lambda$45(this.f9945b, this.f9946c);
            case 1:
                return Braze.logCustomEvent$lambda$50$lambda$48(this.f9945b, this.f9946c);
            default:
                return com.braze.models.outgoing.event.a.b(this.f9945b, this.f9946c);
        }
    }
}
