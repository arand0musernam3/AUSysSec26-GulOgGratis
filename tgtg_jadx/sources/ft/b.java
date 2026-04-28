package ft;

import android.content.SharedPreferences;
import com.app.tgtg.model.local.SearchFilter;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SearchFilter f17901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f17902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashSet f17903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f17904d;

    public static SearchFilter a() {
        d dVar = e.f17923d;
        if (dVar.f17907c == null) {
            dVar.f17907c = c.a();
        }
        SearchFilter searchFilter = e.f17923d.f17907c;
        return searchFilter == null ? new SearchFilter(false, null, null, null, null, null, null, false, 255, null) : searchFilter;
    }

    public final void b(SearchFilter searchFilter) {
        searchFilter.getClass();
        this.f17901a = searchFilter;
        e.f17923d.f17907c = searchFilter;
        SharedPreferences.Editor editorEdit = c.x().edit();
        String strY = c.y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putBoolean(r8.k.l(strY, "availablePurchases"), searchFilter.getShowOnlyAvailable());
        String strY2 = c.y();
        if (strY2 == null) {
            strY2 = null;
        }
        editorEdit.putFloat(r8.k.l(strY2, "_raw_start_time"), searchFilter.getCollectionTimes().getRawTimes().get(0).floatValue());
        String strY3 = c.y();
        if (strY3 == null) {
            strY3 = null;
        }
        editorEdit.putFloat(r8.k.l(strY3, "_raw_end_time"), searchFilter.getCollectionTimes().getRawTimes().get(1).floatValue());
        String strY4 = c.y();
        if (strY4 == null) {
            strY4 = null;
        }
        editorEdit.putString(r8.k.l(strY4, "_item_categories"), searchFilter.getFootTypesAsStringList());
        String strY5 = c.y();
        if (strY5 == null) {
            strY5 = null;
        }
        editorEdit.putString(r8.k.l(strY5, "_diet_preferences"), searchFilter.getDietPreferencesAsStringList());
        String strY6 = c.y();
        if (strY6 == null) {
            strY6 = null;
        }
        editorEdit.putString(r8.k.l(strY6, "search_text"), searchFilter.getSearchText());
        String strY7 = c.y();
        if (strY7 == null) {
            strY7 = null;
        }
        editorEdit.putString(r8.k.l(strY7, "sort_option"), searchFilter.getSortOption().name());
        String strY8 = c.y();
        editorEdit.putString(r8.k.l(strY8 != null ? strY8 : null, "_collection_days"), searchFilter.getCollectionDaysAsStringList());
        editorEdit.apply();
    }
}
