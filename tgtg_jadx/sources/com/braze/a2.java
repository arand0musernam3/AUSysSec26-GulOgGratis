package com.braze;

import com.braze.support.BrazeFileUtils;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9569c;

    public /* synthetic */ a2(int i11, String str) {
        this.f9567a = 2;
        this.f9569c = i11;
        this.f9568b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9567a) {
            case 0:
                return BrazeUser.incrementCustomUserAttribute$lambda$58(this.f9568b, this.f9569c);
            case 1:
                return com.braze.models.outgoing.event.a.b(this.f9568b, this.f9569c);
            default:
                return BrazeFileUtils.downloadFileToPath$lambda$11(this.f9569c, this.f9568b);
        }
    }

    public /* synthetic */ a2(String str, int i11, int i12) {
        this.f9567a = i12;
        this.f9568b = str;
        this.f9569c = i11;
    }
}
