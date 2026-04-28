package com.tgtg.componentlibrary.theme.font;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import q5.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0001\u0001\u000e¨\u0006\u000f"}, d2 = {"Lcom/tgtg/componentlibrary/theme/font/PantryFontFamily;", "", "Lq5/i;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lq5/i;", "getTenon", "()Lq5/i;", "tenon", "b", "getKorolev", "korolev", "c", "getNotoSans", "notoSans", "Lcom/tgtg/componentlibrary/theme/font/FontFamily;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class PantryFontFamily {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final i tenon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final i korolev;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final i notoSans;

    public PantryFontFamily(i iVar, i iVar2, i iVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this.tenon = iVar;
        this.korolev = iVar2;
        this.notoSans = iVar3;
    }

    @NotNull
    public final i getKorolev() {
        return this.korolev;
    }

    @NotNull
    public final i getNotoSans() {
        return this.notoSans;
    }

    @NotNull
    public final i getTenon() {
        return this.tenon;
    }
}
