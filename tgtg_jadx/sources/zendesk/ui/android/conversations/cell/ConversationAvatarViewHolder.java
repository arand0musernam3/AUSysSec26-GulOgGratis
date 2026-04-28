package zendesk.ui.android.conversations.cell;

import a.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import cd.c;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.collections.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pc.d;
import pc.h;
import w6.j;
import zc.e;
import zc.i;
import zendesk.ui.android.R;
import zendesk.ui.android.conversation.avatar.AvatarImageState;
import zendesk.ui.android.conversation.avatar.AvatarMask;
import zendesk.ui.android.internal.ImageLoaderFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lzendesk/ui/android/conversations/cell/ConversationAvatarViewHolder;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lcom/google/android/material/imageview/ShapeableImageView;", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/drawable/Drawable;", "getFallbackDrawable", "(Lcom/google/android/material/imageview/ShapeableImageView;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;", "Lzendesk/ui/android/conversation/avatar/AvatarImageState;", "avatarImageState", "", "onBind$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/avatar/AvatarImageState;)V", "onBind", "onUnbind$zendesk_ui_ui_android", "()V", "onUnbind", "Lzc/e;", "imageLoaderDisposable", "Lzc/e;", "avatarImageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationAvatarViewHolder {
    public static final int $stable = 8;

    @NotNull
    private final ShapeableImageView avatarImageView;

    @Nullable
    private e imageLoaderDisposable;

    public ConversationAvatarViewHolder(@NotNull View view) {
        view.getClass();
        View viewFindViewById = view.findViewById(R.id.zuia_conversation_avatar_image_view);
        viewFindViewById.getClass();
        this.avatarImageView = (ShapeableImageView) viewFindViewById;
    }

    private final Drawable getFallbackDrawable(ShapeableImageView shapeableImageView, Resources resources) {
        int i11 = R.drawable.zuia_conversation_avatar_default;
        Resources.Theme theme = shapeableImageView.getContext().getTheme();
        ThreadLocal threadLocal = j.f43256a;
        return resources.getDrawable(i11, theme);
    }

    public final void onBind$zendesk_ui_ui_android(@Nullable AvatarImageState avatarImageState) {
        ShapeableImageView shapeableImageView = this.avatarImageView;
        Resources resources = shapeableImageView.getContext().getResources();
        e eVar = this.imageLoaderDisposable;
        if (eVar != null) {
            eVar.a();
        }
        Uri uri = avatarImageState != null ? avatarImageState.getUri() : null;
        if (uri == null) {
            shapeableImageView.setBackground(null);
        }
        ImageLoaderFactory imageLoaderFactory = ImageLoaderFactory.INSTANCE;
        Context context = shapeableImageView.getContext();
        context.getClass();
        d imageLoader = imageLoaderFactory.getImageLoader(context);
        Context context2 = shapeableImageView.getContext();
        context2.getClass();
        i iVar = new i(context2);
        iVar.f47443c = uri;
        resources.getClass();
        iVar.f47457r = getFallbackDrawable(shapeableImageView, resources);
        iVar.f47456q = 0;
        iVar.f47459t = getFallbackDrawable(shapeableImageView, resources);
        iVar.f47458s = 0;
        iVar.f47455p = getFallbackDrawable(shapeableImageView, resources);
        iVar.f47454o = 0;
        iVar.b(shapeableImageView);
        if ((avatarImageState != null ? avatarImageState.getMask() : null) == AvatarMask.CIRCLE) {
            iVar.f47447g = a.O(y.T(new c[]{new cd.a()}));
        }
        this.imageLoaderDisposable = ((h) imageLoader).b(iVar.a());
    }

    public final void onUnbind$zendesk_ui_ui_android() {
        e eVar = this.imageLoaderDisposable;
        if (eVar != null) {
            eVar.a();
        }
    }
}
