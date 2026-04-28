package com.tgtg.componentlibrary.component.badgelabel.ext;

import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelGeometry;
import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelSize;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.a;
import x60.j;
import x60.k;
import x60.l;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelSize;", "size", "Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelGeometry;", "badgeLabelGeometryFor", "(Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelSize;Lm3/n;I)Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelGeometry;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBadgeLabelGeometryExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeLabelGeometryExt.kt\ncom/tgtg/componentlibrary/component/badgelabel/ext/BadgeLabelGeometryExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,47:1\n75#2:48\n75#2:49\n75#2:50\n75#2:51\n75#2:52\n*S KotlinDebug\n*F\n+ 1 BadgeLabelGeometryExt.kt\ncom/tgtg/componentlibrary/component/badgelabel/ext/BadgeLabelGeometryExtKt\n*L\n14#1:48\n15#1:49\n16#1:50\n17#1:51\n18#1:52\n*E\n"})
public final class BadgeLabelGeometryExtKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeLabelSize.values().length];
            try {
                iArr[BadgeLabelSize.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeLabelSize.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final BadgeLabelGeometry badgeLabelGeometryFor(@NotNull BadgeLabelSize badgeLabelSize, @Nullable n nVar, int i11) {
        badgeLabelSize.getClass();
        s sVar = (s) nVar;
        l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
        m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
        k kVar = (k) sVar.j(PantryThemeKt.getLocalPantryRadius());
        j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
        a aVar = (a) sVar.j(PantryThemeKt.getLocalPantryBorder());
        int i12 = WhenMappings.$EnumSwitchMapping$0[badgeLabelSize.ordinal()];
        if (i12 == 1) {
            return new BadgeLabelGeometry(lVar.f43990b, lVar.f43993e, 0.0f, 0.0f, mVar.f44017n, mVar.l, mVar.f44016m, kVar.f43979c, jVar.f43967q, lVar.l, aVar.f43897d, 12, null);
        }
        if (i12 == 2) {
            return new BadgeLabelGeometry(lVar.f43993e, lVar.f43995g, 0.0f, lVar.f43994f, mVar.l, mVar.f44016m, mVar.f44020q, kVar.f43979c, jVar.f43968r, lVar.l, aVar.f43897d, 4, null);
        }
        e40.a.f();
        return null;
    }
}
