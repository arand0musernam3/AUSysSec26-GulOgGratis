package com.tgtg.componentlibrary.component.badgelabel.ext;

import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelColors;
import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelVariant;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import e40.a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelVariant;", "variant", "Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelColors;", "badgeLabelColorsFor", "(Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelVariant;Lm3/n;I)Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelColors;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBadgeLabelColorsExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeLabelColorsExt.kt\ncom/tgtg/componentlibrary/component/badgelabel/ext/BadgeLabelColorsExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,44:1\n75#2:45\n*S KotlinDebug\n*F\n+ 1 BadgeLabelColorsExt.kt\ncom/tgtg/componentlibrary/component/badgelabel/ext/BadgeLabelColorsExtKt\n*L\n10#1:45\n*E\n"})
public final class BadgeLabelColorsExtKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeLabelVariant.values().length];
            try {
                iArr[BadgeLabelVariant.Base.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeLabelVariant.Positive.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeLabelVariant.Attention.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeLabelVariant.Accent.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BadgeLabelVariant.Negative.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BadgeLabelVariant.Unavailable.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final BadgeLabelColors badgeLabelColorsFor(@NotNull BadgeLabelVariant badgeLabelVariant, @Nullable n nVar, int i11) {
        badgeLabelVariant.getClass();
        h hVar = (h) ((s) nVar).j(PantryThemeKt.getLocalPantryColor());
        switch (WhenMappings.$EnumSwitchMapping$0[badgeLabelVariant.ordinal()]) {
            case 1:
                return new BadgeLabelColors(hVar.G, hVar.J, hVar.f43922i0, null);
            case 2:
                return new BadgeLabelColors(hVar.f43913e, hVar.U, hVar.f43922i0, null);
            case 3:
                return new BadgeLabelColors(hVar.f43949z, hVar.X, hVar.f43922i0, null);
            case 4:
                return new BadgeLabelColors(hVar.I, hVar.W, hVar.f43922i0, null);
            case 5:
                return new BadgeLabelColors(hVar.f43915f, hVar.L, hVar.f43922i0, null);
            case 6:
                return new BadgeLabelColors(hVar.G, hVar.M, hVar.f43922i0, null);
            default:
                a.f();
                return null;
        }
    }
}
