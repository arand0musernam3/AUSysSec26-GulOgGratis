package com.tgtg.componentlibrary.component.pageheader.ext;

import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderGeometry;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import m5.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.j;
import x60.l;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderGeometry;", "pageHeaderGeometry", "(Lm3/n;I)Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderGeometry;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPageHeaderGeometryExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageHeaderGeometryExt.kt\ncom/tgtg/componentlibrary/component/pageheader/ext/PageHeaderGeometryExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,26:1\n75#2:27\n75#2:28\n75#2:29\n*S KotlinDebug\n*F\n+ 1 PageHeaderGeometryExt.kt\ncom/tgtg/componentlibrary/component/pageheader/ext/PageHeaderGeometryExtKt\n*L\n11#1:27\n12#1:28\n13#1:29\n*E\n"})
public final class PageHeaderGeometryExtKt {
    @NotNull
    public static final PageHeaderGeometry pageHeaderGeometry(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
        l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
        j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
        u0 u0Var = jVar.f43957f;
        u0 u0Var2 = jVar.f43960i;
        u0 u0Var3 = jVar.f43955d;
        float f11 = lVar.f43990b;
        float f12 = mVar.f44014j;
        return new PageHeaderGeometry(u0Var, u0Var2, u0Var3, f11, f12, mVar.l, f12, mVar.f44016m, null);
    }
}
