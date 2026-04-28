package bs;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.Consumer;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.Arrays;
import kotlin.jvm.internal.StringCompanionObject;
import mv.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.f1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Consumer f6685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f6686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BasicItem f6687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f1 f6688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, a aVar, a aVar2) {
        super(context);
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f6685a = aVar;
        this.f6686b = aVar2;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.hidden_store_list_item, (ViewGroup) this, false);
        addView(viewInflate);
        int i11 = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) pd.g.t(R.id.container, viewInflate);
        if (constraintLayout != null) {
            i11 = R.id.ivDelete;
            ImageView imageView = (ImageView) pd.g.t(R.id.ivDelete, viewInflate);
            if (imageView != null) {
                i11 = R.id.ivOpen;
                ImageView imageView2 = (ImageView) pd.g.t(R.id.ivOpen, viewInflate);
                if (imageView2 != null) {
                    i11 = R.id.ivStoreLogo;
                    ImageView imageView3 = (ImageView) pd.g.t(R.id.ivStoreLogo, viewInflate);
                    if (imageView3 != null) {
                        i11 = R.id.tvTitle;
                        TextView textView = (TextView) pd.g.t(R.id.tvTitle, viewInflate);
                        if (textView != null) {
                            this.f6688d = new f1((LinearLayout) viewInflate, constraintLayout, imageView, imageView2, imageView3, textView);
                            return;
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        throw null;
    }

    public final void a(boolean z11) {
        if (!z11) {
            this.f6688d.f34856b.setBackgroundResource(0);
            return;
        }
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        this.f6688d.f34856b.setBackgroundResource(typedValue.resourceId);
    }

    @NotNull
    public final f1 getBinding() {
        return this.f6688d;
    }

    @Nullable
    public final BasicItem getItem() {
        return this.f6687c;
    }

    public final void setBinding(@NotNull f1 f1Var) {
        f1Var.getClass();
        this.f6688d = f1Var;
    }

    public final void setItem(@NotNull BasicItem basicItem) {
        String strI;
        basicItem.getClass();
        this.f6687c = basicItem;
        if (mv.d.m(basicItem).getStoreNameAndBranch() != null) {
            strI = mv.d.m(basicItem).getStoreNameAndBranch() + " (" + r0.i(getContext(), basicItem) + ")";
        } else {
            strI = r0.i(getContext(), basicItem);
        }
        this.f6688d.f34860f.setText(strI);
        ImageView imageView = this.f6688d.f34857c;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getResources().getString(R.string.hidden_store_voice_over_delete_store);
        string.getClass();
        imageView.setContentDescription(String.format(string, Arrays.copyOf(new Object[]{strI}, 1)));
        r0.y(mv.d.k(basicItem).getCurrentUrl(), this.f6688d.f34859e, R.drawable.default_logo);
    }

    public final void setMode(int i11) {
        f1 f1Var = this.f6688d;
        if (i11 == 0) {
            f1Var.f34858d.setVisibility(0);
            f1Var.f34857c.setVisibility(8);
            a(true);
            this.f6688d.f34855a.setClickable(false);
            final int i12 = 0;
            setOnClickListener(new View.OnClickListener(this) { // from class: bs.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f6684b;

                {
                    this.f6684b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            k kVar = this.f6684b;
                            BasicItem basicItem = kVar.f6687c;
                            if (basicItem != null) {
                                kVar.f6685a.accept(basicItem);
                            }
                            break;
                        default:
                            k kVar2 = this.f6684b;
                            BasicItem basicItem2 = kVar2.f6687c;
                            if (basicItem2 != null) {
                                kVar2.f6686b.accept(basicItem2);
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (i11 != 1) {
            return;
        }
        f1Var.f34857c.setVisibility(0);
        f1Var.f34858d.setVisibility(8);
        a(false);
        setOnClickListener(null);
        this.f6688d.f34855a.setClickable(false);
        final int i13 = 1;
        f1Var.f34857c.setOnClickListener(new View.OnClickListener(this) { // from class: bs.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f6684b;

            {
                this.f6684b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        k kVar = this.f6684b;
                        BasicItem basicItem = kVar.f6687c;
                        if (basicItem != null) {
                            kVar.f6685a.accept(basicItem);
                        }
                        break;
                    default:
                        k kVar2 = this.f6684b;
                        BasicItem basicItem2 = kVar2.f6687c;
                        if (basicItem2 != null) {
                            kVar2.f6686b.accept(basicItem2);
                        }
                        break;
                }
            }
        });
    }
}
