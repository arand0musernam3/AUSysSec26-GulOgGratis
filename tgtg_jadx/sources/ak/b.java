package ak;

import a3.p;
import a8.c;
import a8.k;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.l;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import b3.q;
import bn.x;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.npsratingview.NpsRatingView;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import java.util.ArrayList;
import l20.h;
import mg.f;
import mg.g;
import mv.d;
import mv.p0;
import mv.r0;
import pg.j1;
import pg.p2;
import pg.x0;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1512c;

    public b(NpsRatingView npsRatingView, ArrayList arrayList) {
        this.f1510a = 2;
        this.f1512c = npsRatingView;
        this.f1511b = arrayList;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        switch (this.f1510a) {
        }
        return this.f1511b.size();
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onBindViewHolder(r2 r2Var, final int i11) {
        String str;
        int i12 = this.f1510a;
        ArrayList arrayList = this.f1511b;
        switch (i12) {
            case 0:
                a aVar = (a) r2Var;
                aVar.getClass();
                FlashSalesItem flashSalesItem = (FlashSalesItem) arrayList.get(i11);
                boolean z11 = i11 == 0;
                boolean z12 = i11 == arrayList.size() - 1;
                flashSalesItem.getClass();
                String intervalEnd = d.l(flashSalesItem).getIntervalEnd();
                Long lValueOf = intervalEnd != null ? Long.valueOf(p0.h(intervalEnd)) : null;
                a.a(aVar, flashSalesItem, flashSalesItem.getItemsAvailable() > 0 && lValueOf != null && lValueOf.longValue() - System.currentTimeMillis() > 0);
                x0 x0Var = aVar.f1506a;
                b bVar = aVar.f1509d;
                ConstraintLayout constraintLayout = (ConstraintLayout) x0Var.f35262c;
                ImageView imageView = ((j1) x0Var.f35266g).f34924d;
                constraintLayout.getClass();
                d.x(constraintLayout, new p(5, bVar, flashSalesItem));
                x0Var.f35269j.setVisibility(!z11 ? 0 : 8);
                x0Var.f35264e.setVisibility(z12 ? 8 : 0);
                if (!r0.v(flashSalesItem.getInformation().getCoverPicture().getCurrentUrl())) {
                    r0.y(flashSalesItem.getInformation().getCoverPicture().getCurrentUrl(), imageView, R.drawable.default_logo);
                } else if (r0.v(d.m(flashSalesItem).getLogoPicture().getCurrentUrl())) {
                    imageView.setImageResource(android.R.color.transparent);
                } else {
                    r0.y(d.m(flashSalesItem).getLogoPicture().getCurrentUrl(), imageView, R.drawable.default_logo);
                }
                x0Var.f35263d.setText(flashSalesItem.getInformation().getName());
                x0Var.f35265f.setText(d.h(flashSalesItem.getDistance()));
                ((TextView) x0Var.f35267h).setText(x0Var.f35261b.getContext().getString(R.string.store_item_items_left_format, flashSalesItem.getItemsAvailable() > 5 ? "5+" : String.valueOf(flashSalesItem.getItemsAvailable())));
                break;
            case 1:
                hl.a aVar2 = (hl.a) r2Var;
                aVar2.getClass();
                jl.d dVar = (jl.d) arrayList.get(i11);
                dVar.getClass();
                aVar2.f22105a.setContent(new u3.d(new x(i11, dVar, aVar2, 11), true, -1590422039));
                break;
            default:
                g gVar = (g) r2Var;
                gVar.getClass();
                final mg.a aVar3 = (mg.a) arrayList.get(i11);
                NpsRatingView npsRatingView = (NpsRatingView) this.f1512c;
                p2 p2Var = gVar.f29951a;
                aVar3.getClass();
                npsRatingView.getClass();
                if (gVar.f29954d == null) {
                    gVar.f29954d = npsRatingView;
                }
                if (!aVar3.f29933f || (str = aVar3.f29930c) == null) {
                    p2Var.f35070v.setVisibility(4);
                } else {
                    p2Var.f35070v.setText(str);
                }
                TextView textView = p2Var.f35073y.D;
                boolean z13 = aVar3.f29935h;
                View view = p2Var.f986f;
                textView.setText(z13 ? view.getContext().getString(R.string.nps_questionnaire_description_multi_item) : view.getContext().getString(R.string.nps_questionnaire_description));
                ImageView imageView2 = p2Var.f35072x;
                imageView2.getClass();
                d.x(imageView2, new q(npsRatingView, i11, 4));
                pg.r2 r2Var2 = p2Var.f35073y;
                mc.a aVar4 = p2Var.f35069u;
                TextView textView2 = r2Var2.f35129s;
                textView2.getClass();
                TextView textView3 = r2Var2.f35130t;
                textView3.getClass();
                TextView textView4 = r2Var2.f35132v;
                textView4.getClass();
                TextView textView5 = r2Var2.f35133w;
                textView5.getClass();
                TextView textView6 = r2Var2.f35134x;
                textView6.getClass();
                TextView textView7 = r2Var2.f35135y;
                textView7.getClass();
                TextView textView8 = r2Var2.f35136z;
                textView8.getClass();
                TextView textView9 = r2Var2.A;
                textView9.getClass();
                TextView textView10 = r2Var2.B;
                textView10.getClass();
                TextView textView11 = r2Var2.C;
                textView11.getClass();
                TextView textView12 = r2Var2.f35131u;
                textView12.getClass();
                TextView[] textViewArr = {textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12};
                gVar.f29952b = textViewArr;
                final int i13 = 0;
                int i14 = 0;
                while (i14 < 11) {
                    final TextView textView13 = textViewArr[i14];
                    int i15 = i13 + 1;
                    Integer num = aVar3.f29931d;
                    if (num != null && num.intValue() == i13) {
                        g.a(textView13, true);
                    } else {
                        g.a(textView13, false);
                    }
                    final g gVar2 = gVar;
                    textView13.setOnClickListener(new View.OnClickListener() { // from class: mg.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            g gVar3 = gVar2;
                            if (gVar3.f29953c) {
                                a aVar5 = aVar3;
                                Integer num2 = aVar5.f29931d;
                                int i16 = i13;
                                if (num2 != null && num2.intValue() == i16) {
                                    return;
                                }
                                gVar3.f29953c = false;
                                Integer num3 = aVar5.f29931d;
                                if (num3 != null) {
                                    g.a(gVar3.f29952b[num3.intValue()], false);
                                }
                                g.a(textView13, true);
                                aVar5.f29931d = Integer.valueOf(i16);
                                new Handler(Looper.getMainLooper()).postDelayed(new l(gVar3, aVar5, i11), 50L);
                            }
                        }
                    });
                    i14++;
                    gVar = gVar2;
                    i13 = i15;
                }
                g gVar3 = gVar;
                ((EditText) aVar4.f29924d).setOnTouchListener(new h(1));
                p2Var.f35071w.setOnClickListener(new mg.b(gVar3, aVar3, i11));
                ((TextView) aVar4.f29923c).setOnClickListener(new mg.b(aVar3, gVar3, i11));
                int i16 = f.$EnumSwitchMapping$0[aVar3.f29929b.ordinal()];
                if (i16 == 1) {
                    gVar3.c(aVar3);
                } else if (i16 == 2) {
                    gVar3.b(aVar3);
                } else if (i16 != 3) {
                    e40.a.f();
                } else {
                    gVar3.d(aVar3, i11);
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        switch (this.f1510a) {
            case 0:
                viewGroup.getClass();
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.flash_sales_favorite_card_item, viewGroup, false);
                int i12 = R.id.bottomDivider;
                View viewT = pd.g.t(R.id.bottomDivider, viewInflate);
                if (viewT != null) {
                    i12 = R.id.chevron;
                    if (((ImageView) pd.g.t(R.id.chevron, viewInflate)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i12 = R.id.description;
                        TextView textView = (TextView) pd.g.t(R.id.description, viewInflate);
                        if (textView != null) {
                            i12 = R.id.distance;
                            TextView textView2 = (TextView) pd.g.t(R.id.distance, viewInflate);
                            if (textView2 != null) {
                                i12 = R.id.flash_sales_logo;
                                View viewT2 = pd.g.t(R.id.flash_sales_logo, viewInflate);
                                if (viewT2 != null) {
                                    j1 j1VarA = j1.a(viewT2);
                                    i12 = R.id.item_left;
                                    TextView textView3 = (TextView) pd.g.t(R.id.item_left, viewInflate);
                                    if (textView3 != null) {
                                        i12 = R.id.title;
                                        TextView textView4 = (TextView) pd.g.t(R.id.title, viewInflate);
                                        if (textView4 != null) {
                                            i12 = R.id.topDivider;
                                            View viewT3 = pd.g.t(R.id.topDivider, viewInflate);
                                            if (viewT3 != null) {
                                                return new a(this, new x0(constraintLayout, viewT, constraintLayout, textView, textView2, j1VarA, textView3, textView4, viewT3));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
                return null;
            case 1:
                viewGroup.getClass();
                Context context = viewGroup.getContext();
                context.getClass();
                ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return new hl.a(composeView, (gl.d) this.f1512c);
            default:
                viewGroup.getClass();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                int i13 = p2.A;
                DataBinderMapperImpl dataBinderMapperImpl = c.f965a;
                p2 p2Var = (p2) k.Z(layoutInflaterFrom, R.layout.nps_rating_page_base, viewGroup, false, null);
                p2Var.getClass();
                return new g(p2Var, this.f1511b);
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public void onViewRecycled(r2 r2Var) {
        switch (this.f1510a) {
            case 0:
                a aVar = (a) r2Var;
                aVar.getClass();
                b2 b2Var = aVar.f1508c;
                if (b2Var != null && b2Var.g()) {
                    b2 b2Var2 = aVar.f1508c;
                    if (b2Var2 != null) {
                        b2Var2.a(null);
                    }
                    aVar.f1508c = null;
                }
                super.onViewRecycled(aVar);
                break;
            default:
                super.onViewRecycled(r2Var);
                break;
        }
    }

    public /* synthetic */ b(ArrayList arrayList, u70.f fVar, int i11) {
        this.f1510a = i11;
        this.f1511b = arrayList;
        this.f1512c = fVar;
    }
}
