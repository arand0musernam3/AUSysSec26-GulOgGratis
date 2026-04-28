package mr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.model.remote.Country;
import com.app.tgtg.model.remote.user.requests.DietaryPreferences;
import com.app.tgtg.model.remote.user.requests.UserGender;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pg.g1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30073a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f30074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f30075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f30076d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EditDataActivity editDataActivity, DietaryPreferences[] dietaryPreferencesArr, DietaryPreferences dietaryPreferences, b bVar) {
        super(editDataActivity, 0, dietaryPreferencesArr);
        dietaryPreferencesArr.getClass();
        this.f30074b = dietaryPreferencesArr;
        this.f30075c = dietaryPreferences;
        this.f30076d = bVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        g1 g1VarA;
        g1 g1VarB;
        g1 g1VarC;
        int i12 = this.f30073a;
        int i13 = R.style.Body1_Black;
        Object obj = this.f30074b;
        viewGroup.getClass();
        switch (i12) {
            case 0:
                if (view == null) {
                    Object systemService = getContext().getSystemService("layout_inflater");
                    systemService.getClass();
                    g1 g1VarA2 = g1.a(((LayoutInflater) systemService).inflate(R.layout.item_country, viewGroup, false));
                    g1VarA = g1VarA2;
                    view = g1VarA2.f34876b;
                } else {
                    g1VarA = g1.a(view);
                }
                TextView textView = g1VarA.f34877c;
                Object obj2 = ((ArrayList) obj).get(i11);
                obj2.getClass();
                Country country = (Country) obj2;
                view.setOnClickListener(new pt.c(new mg.h(this, i11, 1)));
                textView.setText(country.getDisplayName());
                if (Intrinsics.areEqual(country.getIso(), (String) this.f30075c)) {
                    i13 = R.style.Body1_Bold_Green;
                }
                textView.setTextAppearance(i13);
                break;
            case 1:
                if (view == null) {
                    Object systemService2 = getContext().getSystemService("layout_inflater");
                    systemService2.getClass();
                    g1 g1VarB2 = g1.b(((LayoutInflater) systemService2).inflate(R.layout.item_dietary, viewGroup, false));
                    g1VarB = g1VarB2;
                    view = g1VarB2.f34876b;
                } else {
                    g1VarB = g1.b(view);
                }
                TextView textView2 = g1VarB.f34877c;
                DietaryPreferences dietaryPreferences = ((DietaryPreferences[]) obj)[i11];
                view.setOnClickListener(new pt.c(new bs.c(4, this, dietaryPreferences)));
                textView2.setText(getContext().getString(dietaryPreferences.getRes()));
                if (dietaryPreferences == ((DietaryPreferences) this.f30075c)) {
                    i13 = R.style.Body1_Bold_Green;
                }
                textView2.setTextAppearance(i13);
                break;
            default:
                if (view == null) {
                    Object systemService3 = getContext().getSystemService("layout_inflater");
                    systemService3.getClass();
                    g1 g1VarC2 = g1.c(((LayoutInflater) systemService3).inflate(R.layout.item_gender, viewGroup, false));
                    g1VarC = g1VarC2;
                    view = g1VarC2.f34876b;
                } else {
                    g1VarC = g1.c(view);
                }
                TextView textView3 = g1VarC.f34877c;
                UserGender userGender = ((UserGender[]) obj)[i11];
                view.setOnClickListener(new pt.c(new bs.c(6, this, userGender)));
                textView3.setText(getContext().getString(userGender.getRes()));
                if (userGender == ((UserGender) this.f30075c)) {
                    i13 = R.style.Body1_Bold_Green;
                }
                textView3.setTextAppearance(i13);
                break;
        }
        return view;
    }

    public a(EditDataActivity editDataActivity, ArrayList arrayList, String str, b bVar) {
        super(editDataActivity, 0, arrayList);
        this.f30074b = arrayList;
        this.f30075c = str;
        this.f30076d = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EditDataActivity editDataActivity, UserGender[] userGenderArr, UserGender userGender, b bVar) {
        super(editDataActivity, 0, userGenderArr);
        userGenderArr.getClass();
        this.f30074b = userGenderArr;
        this.f30075c = userGender;
        this.f30076d = bVar;
    }
}
