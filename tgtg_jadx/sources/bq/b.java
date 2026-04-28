package bq;

import a3.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import c50.w;
import c6.y;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.StoreLegalInformation;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6578c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pg.c f6579b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        super(context);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.store_view_contact_details, (ViewGroup) this, false);
        addView(viewInflate);
        int i11 = R.id.ivCompany;
        ImageView imageView = (ImageView) pd.g.t(R.id.ivCompany, viewInflate);
        if (imageView != null) {
            i11 = R.id.tvAddress;
            TextView textView = (TextView) pd.g.t(R.id.tvAddress, viewInflate);
            if (textView != null) {
                i11 = R.id.tvCompany;
                TextView textView2 = (TextView) pd.g.t(R.id.tvCompany, viewInflate);
                if (textView2 != null) {
                    i11 = R.id.tvContactInfoTitle;
                    if (((TextView) pd.g.t(R.id.tvContactInfoTitle, viewInflate)) != null) {
                        i11 = R.id.tvCvr;
                        TextView textView3 = (TextView) pd.g.t(R.id.tvCvr, viewInflate);
                        if (textView3 != null) {
                            i11 = R.id.tvLegalText;
                            TextView textView4 = (TextView) pd.g.t(R.id.tvLegalText, viewInflate);
                            if (textView4 != null) {
                                i11 = R.id.tvWebsite;
                                TextView textView5 = (TextView) pd.g.t(R.id.tvWebsite, viewInflate);
                                if (textView5 != null) {
                                    this.f6579b = new pg.c((ConstraintLayout) viewInflate, imageView, textView, textView2, textView3, textView4, textView5, 4);
                                    setLayoutParams(new RecyclerView.a(-1, -2));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        throw null;
    }

    public static void b(TextView textView, String str) {
        if (str == null || StringsKt.H(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }

    @Override // bq.g
    public final void a(StoreInformation storeInformation, y yVar, zp.b bVar) {
        storeInformation.getClass();
        yVar.getClass();
        bVar.getClass();
        StoreLegalInformation storeLegalInformation = storeInformation.getStoreLegalInformation();
        String legalText = storeLegalInformation != null ? storeLegalInformation.getLegalText() : null;
        pg.c cVar = this.f6579b;
        TextView textView = (TextView) cVar.f34806g;
        ImageView imageView = (ImageView) cVar.f34802c;
        TextView textView2 = (TextView) cVar.f34803d;
        TextView textView3 = (TextView) cVar.f34805f;
        TextView textView4 = (TextView) cVar.f34804e;
        TextView textView5 = (TextView) cVar.f34807h;
        b(textView, legalText);
        b(textView5, storeInformation.getWebsite());
        StoreLegalInformation storeLegalInformation2 = storeInformation.getStoreLegalInformation();
        b(textView4, storeLegalInformation2 != null ? storeLegalInformation2.getDebtorLegalName() : null);
        String taxIdentifier = storeInformation.getTaxIdentifier();
        b(textView3, (taxIdentifier == null || StringsKt.H(taxIdentifier)) ? "" : r8.k.m(getResources().getString(R.string.checkout_view_label_tax_id), " ", storeInformation.getTaxIdentifier()));
        StoreLegalInformation storeLegalInformation3 = storeInformation.getStoreLegalInformation();
        b(textView2, storeLegalInformation3 != null ? storeLegalInformation3.getStoreAddress() : null);
        if (textView5.getVisibility() == 0) {
            textView2 = textView5;
        } else if (textView4.getVisibility() == 0) {
            textView2 = textView4;
        } else if (textView3.getVisibility() == 0) {
            textView2 = textView3;
        } else if (textView2.getVisibility() != 0) {
            textView2 = null;
        }
        if (textView2 == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            ConstraintLayout.a aVar = layoutParams instanceof ConstraintLayout.a ? (ConstraintLayout.a) layoutParams : null;
            if (aVar != null) {
                aVar.f2322i = textView2.getId();
                aVar.l = textView2.getId();
            }
            imageView.requestLayout();
        }
        mv.d.x(textView5, new p(12, storeInformation, this));
    }
}
