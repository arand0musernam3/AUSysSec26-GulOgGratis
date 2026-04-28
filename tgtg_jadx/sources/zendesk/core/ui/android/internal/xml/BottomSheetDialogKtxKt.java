package zendesk.core.ui.android.internal.xml;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import c50.w;
import com.app.tgtg.R;
import com.braze.h2;
import com.google.android.material.bottomsheet.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.core.ui.android.internal.InternalZendeskUIApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001a*\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\"\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"setFullScreen", "", "Landroid/app/Dialog;", "cornerRadius", "", "skipCollapsed", "", "setConversationExtensionFullScreen", "size", "", "MAX_WIDTH_FOR_BOTTOM_SHEET", "zendesk.core.ui_core-ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBottomSheetDialogKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetDialogKtx.kt\nzendesk/core/ui/android/internal/xml/BottomSheetDialogKtxKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,141:1\n311#2:142\n327#2,4:143\n312#2:147\n311#2:148\n327#2,4:149\n312#2:153\n*S KotlinDebug\n*F\n+ 1 BottomSheetDialogKtx.kt\nzendesk/core/ui/android/internal/xml/BottomSheetDialogKtxKt\n*L\n43#1:142\n43#1:143,4\n43#1:147\n107#1:148\n107#1:149,4\n107#1:153\n*E\n"})
public final class BottomSheetDialogKtxKt {
    private static final int MAX_WIDTH_FOR_BOTTOM_SHEET = 640;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, zendesk.core.ui.android.internal.xml.a] */
    @InternalZendeskUIApi
    public static final void setConversationExtensionFullScreen(@NotNull Dialog dialog, final int i11, boolean z11, final double d3) {
        ViewTreeObserver viewTreeObserver;
        dialog.getClass();
        if (!(dialog instanceof l)) {
            h2.b("Dialog must be a BottomSheetDialog.");
            return;
        }
        final int i12 = (int) (MAX_WIDTH_FOR_BOTTOM_SHEET * Resources.getSystem().getDisplayMetrics().density);
        l lVar = (l) dialog;
        final ViewGroup viewGroup = (ViewGroup) lVar.findViewById(R.id.design_bottom_sheet);
        final Ref.IntRef intRef = new Ref.IntRef();
        final ?? r12 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: zendesk.core.ui.android.internal.xml.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BottomSheetDialogKtxKt.setConversationExtensionFullScreen$lambda$7$lambda$5(viewGroup, intRef, d3, i12);
            }
        };
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != 0) {
            viewTreeObserver.addOnGlobalLayoutListener(r12);
        }
        if (viewGroup != null) {
            viewGroup.setClipToOutline(true);
        }
        if (viewGroup != null) {
            viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: zendesk.core.ui.android.internal.xml.BottomSheetDialogKtxKt$setConversationExtensionFullScreen$2$1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    view.getClass();
                    outline.getClass();
                    int width = view.getWidth();
                    int height = view.getHeight();
                    int i13 = i11;
                    outline.setRoundRect(0, 0, width, height + i13, i13);
                }
            });
        }
        lVar.getBehavior().J(3);
        lVar.getBehavior().K = false;
        lVar.getBehavior().J = z11;
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: zendesk.core.ui.android.internal.xml.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                BottomSheetDialogKtxKt.setConversationExtensionFullScreen$lambda$7$lambda$6(viewGroup, r12, dialogInterface);
            }
        });
    }

    public static /* synthetic */ void setConversationExtensionFullScreen$default(Dialog dialog, int i11, boolean z11, double d3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 30;
        }
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        if ((i12 & 4) != 0) {
            d3 = 1.0d;
        }
        setConversationExtensionFullScreen(dialog, i11, z11, d3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setConversationExtensionFullScreen$lambda$7$lambda$5(ViewGroup viewGroup, Ref.IntRef intRef, double d3, int i11) {
        View rootView;
        Rect rect = new Rect();
        if (viewGroup != null && (rootView = viewGroup.getRootView()) != null) {
            rootView.getWindowVisibleDisplayFrame(rect);
        }
        int i12 = rect.bottom - rect.top;
        if (i12 != intRef.element) {
            intRef.element = i12;
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams == null) {
                    w.l("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                }
                layoutParams.height = (int) (((double) i12) * d3);
                if (layoutParams.width <= i11) {
                    i11 = -1;
                }
                layoutParams.width = i11;
                viewGroup.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setConversationExtensionFullScreen$lambda$7$lambda$6(ViewGroup viewGroup, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, DialogInterface dialogInterface) {
        ViewTreeObserver viewTreeObserver;
        if (viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    @InternalZendeskUIApi
    public static final void setFullScreen(@NotNull Dialog dialog, final int i11, boolean z11) {
        dialog.getClass();
        if (!(dialog instanceof l)) {
            h2.b("Dialog must be a BottomSheetDialog.");
            return;
        }
        l lVar = (l) dialog;
        ViewGroup viewGroup = (ViewGroup) lVar.findViewById(R.id.design_bottom_sheet);
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                w.l("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams.height = -1;
                viewGroup.setLayoutParams(layoutParams);
            }
        }
        if (viewGroup != null) {
            viewGroup.setClipToOutline(true);
        }
        if (viewGroup != null) {
            viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: zendesk.core.ui.android.internal.xml.BottomSheetDialogKtxKt$setFullScreen$2$2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    view.getClass();
                    outline.getClass();
                    int width = view.getWidth();
                    int height = view.getHeight();
                    int i12 = i11;
                    outline.setRoundRect(0, 0, width, height + i12, i12);
                }
            });
        }
        lVar.getBehavior().J(3);
        lVar.getBehavior().K = false;
        lVar.getBehavior().J = z11;
    }

    public static /* synthetic */ void setFullScreen$default(Dialog dialog, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 30;
        }
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        setFullScreen(dialog, i11, z11);
    }
}
