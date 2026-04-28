package bs;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.lifecycle.m1;
import b0.a0;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.mapService.request.LocationRequest;
import com.app.tgtg.model.remote.user.requests.DietaryPreferences;
import com.app.tgtg.model.remote.user.requests.UserGender;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mv.r0;
import pg.b1;
import pg.p;
import pg.r1;
import pg.x0;
import uk.q;
import uk.r;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6672c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f6670a = i11;
        this.f6671b = obj;
        this.f6672c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker, x70.c] */
    /* JADX WARN: Type inference failed for: r2v1 */
    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i11 = this.f6670a;
        x0 x0Var = 0;
        uk.c cVar = null;
        int i12 = 1;
        Object obj2 = this.f6672c;
        Object obj3 = this.f6671b;
        switch (i11) {
            case 0:
                HiddenStoresActivity hiddenStoresActivity = (HiddenStoresActivity) obj2;
                Editable editable = (Editable) obj;
                int i13 = HiddenStoresActivity.f9412k;
                editable.getClass();
                ((Button) ((x0) obj3).f35265f).setEnabled(editable.length() > 0);
                x0 x0Var2 = hiddenStoresActivity.f9416e;
                if (x0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    x0Var = x0Var2;
                }
                x0Var.f35268i.setVisibility(8);
                break;
            case 1:
                c1.e eVar = (c1.e) obj3;
                c1.o oVar = (c1.o) obj2;
                oVar.close();
                Surface surface = (Surface) eVar.f6859h.remove(oVar);
                if (surface != null) {
                    c1.g gVar = eVar.f6852a;
                    e1.j.d((AtomicBoolean) gVar.f6867c, true);
                    e1.j.c((Thread) gVar.f6869e);
                    gVar.r(surface, true);
                }
                break;
            case 2:
                d1.d dVar = (d1.d) obj3;
                c1.o oVar2 = (c1.o) obj2;
                oVar2.close();
                Surface surface2 = (Surface) dVar.f13684h.remove(oVar2);
                if (surface2 != null) {
                    d1.c cVar2 = dVar.f13677a;
                    e1.j.d((AtomicBoolean) cVar2.f6867c, true);
                    e1.j.c((Thread) cVar2.f6869e);
                    cVar2.r(surface2, true);
                }
                break;
            case 3:
                fb.i iVar = (fb.i) obj3;
                Activity activity = (Activity) obj2;
                a8.h hVar = iVar.f17537e;
                if (hVar != null) {
                    hVar.x(activity, iVar.a(activity));
                }
                break;
            case 4:
                mr.a aVar = (mr.a) obj3;
                DietaryPreferences dietaryPreferences = (DietaryPreferences) obj2;
                ((View) obj).getClass();
                aVar.f30075c = dietaryPreferences;
                aVar.notifyDataSetChanged();
                ((mr.b) aVar.f30076d).invoke(dietaryPreferences);
                break;
            case 5:
                int i14 = 0;
                p pVar = (p) obj3;
                EditDataActivity editDataActivity = (EditDataActivity) obj2;
                int i15 = EditDataActivity.f9359n;
                ((Editable) obj).getClass();
                pVar.f35043h.setVisibility(8);
                ImageButton imageButton = (ImageButton) ((b1) pVar.f35055u).f34796d;
                String string = ((EditText) pVar.f35047m).getText().toString();
                String str = editDataActivity.b0().f30127t;
                String string2 = ((EditText) pVar.f35048n).getText().toString();
                String str2 = editDataActivity.b0().f30128u;
                or.a aVar2 = (or.a) editDataActivity.b0().f30109a.a("DATA");
                int i16 = aVar2 == null ? -1 : mr.d.$EnumSwitchMapping$2[aVar2.ordinal()];
                if (i16 == 1 ? Intrinsics.areEqual(string, str) : i16 == 3 ? r0.v(string) || r0.v(string2) || (Intrinsics.areEqual(string, str) && Intrinsics.areEqual(string2, str2)) : r0.v(string) || Intrinsics.areEqual(string, str)) {
                    i14 = 4;
                }
                imageButton.setVisibility(i14);
                break;
            case 6:
                mr.a aVar3 = (mr.a) obj3;
                UserGender userGender = (UserGender) obj2;
                ((View) obj).getClass();
                aVar3.f30075c = userGender;
                aVar3.notifyDataSetChanged();
                ((mr.b) aVar3.f30076d).invoke(userGender);
                break;
            case 7:
                ((tg.i) obj3).f((String) obj2, (LatLngInfo) obj);
                break;
            case 8:
                final q qVar = (q) obj3;
                final r1 r1Var = (r1) obj2;
                TextView textView = r1Var.l;
                EditText editText = r1Var.f35126k;
                ProgressBar progressBar = r1Var.f35125j;
                Editable editable2 = (Editable) obj;
                int i17 = q.f41347y;
                editable2.getClass();
                BottomSheetBehavior bottomSheetBehavior = qVar.f41366t;
                if (bottomSheetBehavior != null && bottomSheetBehavior.N == 3 && editable2.length() > 2) {
                    uk.c cVar3 = qVar.f41353f;
                    if (cVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
                        cVar3 = null;
                    }
                    String string3 = editable2.toString();
                    cVar3.getClass();
                    string3.getClass();
                    r rVarQ = cVar3.q();
                    rVarQ.getClass();
                    LocationRequest locationRequest = new LocationRequest((String) x0Var, i12, (DefaultConstructorMarker) x0Var);
                    locationRequest.setQuery(string3);
                    f0.B(m1.d(rVarQ), null, null, new tm.d(rVarQ, locationRequest, x0Var, 6), 3);
                    cVar3.f41321m = string3;
                    progressBar.setVisibility(8);
                    textView.setVisibility(4);
                    editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), d70.b.a(10), editText.getPaddingBottom());
                    editText.setCompoundDrawablesWithIntrinsicBounds(a0.x(qVar.getContext(), R.drawable.system_icon_search_primary_30), (Drawable) null, a0.x(qVar.getContext(), R.drawable.system_icon_close_neutral_80), (Drawable) null);
                    editText.setOnTouchListener(new View.OnTouchListener() { // from class: uk.k
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            int i18 = q.f41347y;
                            motionEvent.getClass();
                            if (view != null) {
                                view.performClick();
                            }
                            if (motionEvent.getAction() != 1) {
                                return false;
                            }
                            if (r1Var.f35126k.getCompoundDrawables()[2] == null || motionEvent.getRawX() < r4.getRight() - r4.getCompoundDrawables()[2].getBounds().width()) {
                                return false;
                            }
                            q qVar2 = qVar;
                            m mVar = qVar2.f41354g;
                            if (mVar != null) {
                                mVar.clear();
                            }
                            ((r1) qVar2.f41370x.f35151e).f35126k.getText().clear();
                            c cVar4 = qVar2.f41353f;
                            if (cVar4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
                                cVar4 = null;
                            }
                            cVar4.u();
                            return true;
                        }
                    });
                    break;
                } else {
                    editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), d70.b.a(30), editText.getPaddingBottom());
                    BottomSheetBehavior bottomSheetBehavior2 = qVar.f41366t;
                    if (bottomSheetBehavior2 == null || bottomSheetBehavior2.N != 3) {
                        editText.setCompoundDrawablesWithIntrinsicBounds(a0.x(qVar.getContext(), R.drawable.system_icon_search_neutral_60), (Drawable) null, (Drawable) null, (Drawable) null);
                    } else {
                        editText.setCompoundDrawablesWithIntrinsicBounds(a0.x(qVar.getContext(), R.drawable.system_icon_search_primary_30), (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    editText.setOnTouchListener(null);
                    uk.m mVar = qVar.f41354g;
                    if (mVar != null) {
                        mVar.clear();
                    }
                    progressBar.setVisibility(8);
                    BottomSheetBehavior bottomSheetBehavior3 = qVar.f41366t;
                    if (bottomSheetBehavior3 != null && bottomSheetBehavior3.N == 3 && editable2.length() < 3 && editable2.toString().length() > 0) {
                        textView.setVisibility(0);
                        break;
                    } else {
                        BottomSheetBehavior bottomSheetBehavior4 = qVar.f41366t;
                        if (bottomSheetBehavior4 != null && bottomSheetBehavior4.N == 3) {
                            uk.c cVar4 = qVar.f41353f;
                            if (cVar4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
                            } else {
                                cVar = cVar4;
                            }
                            cVar.u();
                            textView.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            default:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                break;
        }
    }
}
