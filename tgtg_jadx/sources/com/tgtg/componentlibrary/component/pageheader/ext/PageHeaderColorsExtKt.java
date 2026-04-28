package com.tgtg.componentlibrary.component.pageheader.ext;

import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderColors;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderColors;", "pageHeaderColors", "(Lm3/n;I)Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderColors;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPageHeaderColorsExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageHeaderColorsExt.kt\ncom/tgtg/componentlibrary/component/pageheader/ext/PageHeaderColorsExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,17:1\n75#2:18\n*S KotlinDebug\n*F\n+ 1 PageHeaderColorsExt.kt\ncom/tgtg/componentlibrary/component/pageheader/ext/PageHeaderColorsExtKt\n*L\n9#1:18\n*E\n"})
public final class PageHeaderColorsExtKt {
    @NotNull
    public static final PageHeaderColors pageHeaderColors(@Nullable n nVar, int i11) {
        h hVar = (h) ((s) nVar).j(PantryThemeKt.getLocalPantryColor());
        long j9 = hVar.f43905a;
        long j11 = hVar.J;
        return new PageHeaderColors(j9, j11, hVar.K, j11, null);
    }
}
