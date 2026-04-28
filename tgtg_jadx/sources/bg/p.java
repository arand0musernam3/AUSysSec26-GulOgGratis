package bg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.Country;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f6213b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, ArrayList arrayList, o oVar) {
        super(context);
        arrayList.getClass();
        this.f6212a = arrayList;
        this.f6213b = oVar;
        setContentView(LayoutInflater.from(context).inflate(R.layout.country_popup, (ViewGroup) null));
        setHeight(-2);
        setWidth(-2);
        setBackgroundDrawable(new ColorDrawable(-1));
        setElevation(20.0f);
        setFocusable(true);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            arrayList2.add(((Country) next).getDisplayName());
        }
        context.getClass();
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.country_list_item, arrayList2);
        ListView listView = (ListView) getContentView().findViewById(R.id.countryList);
        listView.setAdapter((ListAdapter) arrayAdapter);
        listView.setOnItemClickListener(new n(this, 0));
    }
}
