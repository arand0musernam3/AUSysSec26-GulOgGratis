package zendesk.core.ui.android.internal.xml;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.core.ui.android.internal.InternalZendeskUIApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"applyWindowInsets", "", "Landroid/view/View;", "insetType", "", "Lzendesk/core/ui/android/internal/xml/InsetType;", "(Landroid/view/View;[Lzendesk/core/ui/android/internal/xml/InsetType;)V", "zendesk.core.ui_core-ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSystemWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemWindowInsets.kt\nzendesk/core/ui/android/internal/xml/SystemWindowInsetsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,69:1\n13472#2:70\n13473#2:95\n161#3,8:71\n161#3,8:79\n146#3,8:87\n*S KotlinDebug\n*F\n+ 1 SystemWindowInsets.kt\nzendesk/core/ui/android/internal/xml/SystemWindowInsetsKt\n*L\n21#1:70\n21#1:95\n24#1:71,8\n34#1:79,8\n46#1:87,8\n*E\n"})
public final class SystemWindowInsetsKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InsetType.values().length];
            try {
                iArr[InsetType.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InsetType.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InsetType.HORIZONTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InternalZendeskUIApi
    public static final void applyWindowInsets(@NotNull View view, @NotNull final InsetType... insetTypeArr) {
        view.getClass();
        insetTypeArr.getClass();
        if (Build.VERSION.SDK_INT >= 35) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: zendesk.core.ui.android.internal.xml.c
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return SystemWindowInsetsKt.applyWindowInsets$lambda$1(insetTypeArr, view2, windowInsets);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets applyWindowInsets$lambda$1(InsetType[] insetTypeArr, View view, WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        boolean zIsVisible = windowInsets.isVisible(WindowInsets.Type.ime());
        for (InsetType insetType : insetTypeArr) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[insetType.ordinal()];
            if (i11 == 1) {
                view.setPadding(view.getPaddingLeft(), windowInsets.getInsets(WindowInsets.Type.statusBars()).top, view.getPaddingRight(), view.getPaddingBottom());
            } else if (i11 == 2) {
                Insets insets = zIsVisible ? windowInsets.getInsets(WindowInsets.Type.ime()) : windowInsets.getInsets(WindowInsets.Type.systemBars());
                insets.getClass();
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), insets.bottom);
            } else {
                if (i11 != 3) {
                    e40.a.f();
                    return null;
                }
                Insets insets2 = windowInsets.getInsets(WindowInsets.Type.systemBars());
                insets2.getClass();
                Insets insets3 = windowInsets.getInsets(WindowInsets.Type.displayCutout());
                insets3.getClass();
                int iB = w70.b.b(insets2.right, insets3.right, insets2.left, insets3.left);
                view.setPaddingRelative(iB, view.getPaddingTop(), iB, view.getPaddingBottom());
            }
        }
        return windowInsets;
    }
}
