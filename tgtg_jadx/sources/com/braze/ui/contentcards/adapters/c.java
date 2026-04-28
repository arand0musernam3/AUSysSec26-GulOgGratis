package com.braze.ui.contentcards.adapters;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentCardAdapter f10919c;

    public /* synthetic */ c(int i11, int i12, ContentCardAdapter contentCardAdapter) {
        this.f10917a = i12;
        this.f10918b = i11;
        this.f10919c = contentCardAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10917a) {
            case 0:
                return ContentCardAdapter.onItemDismiss$lambda$0(this.f10918b, this.f10919c);
            default:
                return ContentCardAdapter.getCardAtIndex$lambda$7(this.f10918b, this.f10919c);
        }
    }
}
