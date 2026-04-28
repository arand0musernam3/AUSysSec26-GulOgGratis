package com.tgtg.componentlibrary.component.pageheader;

import c60.c;
import com.braze.Constants;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderState;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderVariant;
import com.tgtg.componentlibrary.component.pageheader.variant.GlobalPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.variant.ModalPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.variant.PagePantryPageHeaderKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s60.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR \u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\u0019R \u0010\u001e\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\u0019R \u0010!\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b!\u0010\u0017\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\"\u0010\u0019R \u0010$\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b$\u0010\u0017\u0012\u0004\b&\u0010\u0003\u001a\u0004\b%\u0010\u0019R \u0010'\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b'\u0010\u0017\u0012\u0004\b)\u0010\u0003\u001a\u0004\b(\u0010\u0019R \u0010*\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b*\u0010\u0017\u0012\u0004\b,\u0010\u0003\u001a\u0004\b+\u0010\u0019R \u0010-\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b-\u0010\u0017\u0012\u0004\b/\u0010\u0003\u001a\u0004\b.\u0010\u0019R \u00100\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b0\u0010\u0017\u0012\u0004\b2\u0010\u0003\u001a\u0004\b1\u0010\u0019¨\u00063"}, d2 = {"Lcom/tgtg/componentlibrary/component/pageheader/PantryPageHeaderDoc;", "", "<init>", "()V", "", "PantryPageHeader", "(Lm3/n;I)V", "Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderVariant;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderVariant;", "getVariant", "()Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderVariant;", "getVariant$annotations", "variant", "Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderState;", "b", "Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderState;", "getBehavior", "()Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderState;", "getBehavior$annotations", "behavior", "", "tabs", "Z", "getTabs", "()Z", "getTabs$annotations", "iconButton", "getIconButton", "getIconButton$annotations", "iconButton2nd", "getIconButton2nd", "getIconButton2nd$annotations", MessageBundle.TITLE_ENTRY, "getTitle", "getTitle$annotations", "description", "getDescription", "getDescription$annotations", "button", "getButton", "getButton$annotations", "back", "getBack", "getBack$annotations", "avatar", "getAvatar", "getAvatar$annotations", "link", "getLink", "getLink$annotations", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryPageHeaderDoc.figma.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryPageHeaderDoc.figma.kt\ncom/tgtg/componentlibrary/component/pageheader/PantryPageHeaderDoc\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,139:1\n1128#2,6:140\n1128#2,6:146\n*S KotlinDebug\n*F\n+ 1 PantryPageHeaderDoc.figma.kt\ncom/tgtg/componentlibrary/component/pageheader/PantryPageHeaderDoc\n*L\n104#1:140,6\n121#1:146,6\n*E\n"})
public final class PantryPageHeaderDoc {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final PageHeaderVariant variant = (PageHeaderVariant) ((Pair) y.x(new Pair[]{new Pair("Global", PageHeaderVariant.Global), new Pair("Page", PageHeaderVariant.Page), new Pair("Modal", PageHeaderVariant.Modal)})).f26486b;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final PageHeaderState behavior = (PageHeaderState) ((Pair) y.x(new Pair[]{new Pair("Full", PageHeaderState.Full), new Pair("Collapsed", PageHeaderState.Collapsed)})).f26486b;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PageHeaderVariant.values().length];
            try {
                iArr[PageHeaderVariant.Global.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PageHeaderVariant.Page.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PageHeaderVariant.Modal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void PantryPageHeader(@Nullable n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(273487356);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[this.variant.ordinal()];
            if (i13 != 1) {
                f fVar = m.f29332a;
                if (i13 == 2) {
                    sVar.a0(828390893);
                    Object objM = sVar.M();
                    if (objM == fVar) {
                        objM = new b(23);
                        sVar.k0(objM);
                    }
                    Function0 function0 = (Function0) objM;
                    ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                    PagePantryPageHeaderKt.PagePantryPageHeader("Title", this.behavior, function0, null, "Supporting Text", PantryPageHeaderKt.BACK_CONTENT_DESCRIPTION, composableSingletons$PantryPageHeaderDoc_figmaKt.m868getLambda$1119344327$app_release(), null, composableSingletons$PantryPageHeaderDoc_figmaKt.m871getLambda$1935391557$app_release(), null, sVar, 102457734, 648);
                    sVar = sVar;
                    sVar.q(false);
                } else {
                    if (i13 != 3) {
                        throw e0.f.v(sVar, 828347904, false);
                    }
                    sVar.a0(-88993272);
                    Object objM2 = sVar.M();
                    if (objM2 == fVar) {
                        objM2 = new b(24);
                        sVar.k0(objM2);
                    }
                    ModalPantryPageHeaderKt.ModalPantryPageHeader("Title", this.behavior, (Function0) objM2, null, ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE.getLambda$2118280308$app_release(), "Supporting Text", PantryPageHeaderKt.CLOSE_CONTENT_DESCRIPTION, sVar, 1794438, 8);
                    sVar.q(false);
                }
            } else {
                sVar.a0(828348253);
                ComposableSingletons$PantryPageHeaderDoc_figmaKt composableSingletons$PantryPageHeaderDoc_figmaKt2 = ComposableSingletons$PantryPageHeaderDoc_figmaKt.INSTANCE;
                GlobalPantryPageHeaderKt.GlobalPantryPageHeader("Title", this.behavior, null, "Supporting Text", composableSingletons$PantryPageHeaderDoc_figmaKt2.getLambda$950198754$app_release(), composableSingletons$PantryPageHeaderDoc_figmaKt2.getLambda$542175139$app_release(), composableSingletons$PantryPageHeaderDoc_figmaKt2.getLambda$134151524$app_release(), composableSingletons$PantryPageHeaderDoc_figmaKt2.m874getLambda$273872091$app_release(), composableSingletons$PantryPageHeaderDoc_figmaKt2.m875getLambda$681895706$app_release(), sVar, 115043334, 4);
                sVar = sVar;
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(this, i11, 19);
        }
    }

    public final boolean getAvatar() {
        return false;
    }

    public final boolean getBack() {
        return false;
    }

    @NotNull
    public final PageHeaderState getBehavior() {
        return this.behavior;
    }

    public final boolean getButton() {
        return false;
    }

    public final boolean getDescription() {
        return false;
    }

    public final boolean getIconButton() {
        return false;
    }

    public final boolean getIconButton2nd() {
        return false;
    }

    public final boolean getLink() {
        return false;
    }

    public final boolean getTabs() {
        return false;
    }

    public final boolean getTitle() {
        return true;
    }

    @NotNull
    public final PageHeaderVariant getVariant() {
        return this.variant;
    }

    public static /* synthetic */ void getAvatar$annotations() {
    }

    public static /* synthetic */ void getBack$annotations() {
    }

    public static /* synthetic */ void getBehavior$annotations() {
    }

    public static /* synthetic */ void getButton$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getIconButton$annotations() {
    }

    public static /* synthetic */ void getIconButton2nd$annotations() {
    }

    public static /* synthetic */ void getLink$annotations() {
    }

    public static /* synthetic */ void getTabs$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getVariant$annotations() {
    }
}
