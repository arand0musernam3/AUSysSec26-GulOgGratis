package com.braze;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Braze f9565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9566d;

    public /* synthetic */ a1(Braze braze, String str, String str2) {
        this.f9563a = 0;
        this.f9565c = braze;
        this.f9564b = str;
        this.f9566d = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9563a) {
            case 0:
                return Braze.logBannerClick$lambda$98(this.f9565c, this.f9564b, this.f9566d);
            case 1:
                return Braze.changeUser$lambda$137(this.f9564b, this.f9565c, this.f9566d);
            case 2:
                return Braze.logPushStoryPageClicked$lambda$71(this.f9564b, this.f9566d, this.f9565c);
            default:
                return Braze.addSerializedCardJsonToStorage$lambda$170(this.f9564b, this.f9565c, this.f9566d);
        }
    }

    public /* synthetic */ a1(String str, Braze braze, String str2, int i11) {
        this.f9563a = i11;
        this.f9564b = str;
        this.f9565c = braze;
        this.f9566d = str2;
    }

    public /* synthetic */ a1(String str, String str2, Braze braze) {
        this.f9563a = 2;
        this.f9564b = str;
        this.f9566d = str2;
        this.f9565c = braze;
    }
}
