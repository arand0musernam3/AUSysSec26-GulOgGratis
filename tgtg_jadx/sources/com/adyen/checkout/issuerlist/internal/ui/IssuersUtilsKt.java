package com.adyen.checkout.issuerlist.internal.ui;

import com.adyen.checkout.components.core.InputDetail;
import com.adyen.checkout.components.core.Issuer;
import com.adyen.checkout.components.core.Item;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.n0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\b"}, d2 = {"getLegacyIssuers", "", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "Lcom/adyen/checkout/components/core/InputDetail;", "environment", "Lcom/adyen/checkout/core/Environment;", "mapToModel", "Lcom/adyen/checkout/components/core/Issuer;", "issuer-list_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIssuersUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssuersUtils.kt\ncom/adyen/checkout/issuerlist/internal/ui/IssuersUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1611#2,9:36\n1863#2:45\n1864#2:47\n1620#2:48\n1368#2:49\n1454#2,5:50\n1611#2,9:55\n1863#2:64\n1864#2:66\n1620#2:67\n1#3:46\n1#3:65\n*S KotlinDebug\n*F\n+ 1 IssuersUtils.kt\ncom/adyen/checkout/issuerlist/internal/ui/IssuersUtilsKt\n*L\n17#1:36,9\n17#1:45\n17#1:47\n17#1:48\n27#1:49\n27#1:50,5\n28#1:55,9\n28#1:64\n28#1:66\n28#1:67\n17#1:46\n28#1:65\n*E\n"})
public final class IssuersUtilsKt {
    @NotNull
    public static final List<IssuerModel> getLegacyIssuers(@Nullable List<InputDetail> list, @NotNull Environment environment) {
        environment.getClass();
        if (list == null) {
            list = n0.f26529a;
        }
        ArrayList<Item> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<Item> items = ((InputDetail) it.next()).getItems();
            if (items == null) {
                items = n0.f26529a;
            }
            i0.s(items, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Item item : arrayList) {
            String id2 = item.getId();
            String name = item.getName();
            IssuerModel issuerModel = (id2 == null || name == null) ? null : new IssuerModel(id2, name, environment);
            if (issuerModel != null) {
                arrayList2.add(issuerModel);
            }
        }
        return arrayList2;
    }

    @NotNull
    public static final List<IssuerModel> mapToModel(@NotNull List<Issuer> list, @NotNull Environment environment) {
        list.getClass();
        environment.getClass();
        ArrayList arrayList = new ArrayList();
        for (Issuer issuer : list) {
            String id2 = issuer.getId();
            String name = issuer.getName();
            IssuerModel issuerModel = (issuer.getIsDisabled() || id2 == null || name == null) ? null : new IssuerModel(id2, name, environment);
            if (issuerModel != null) {
                arrayList.add(issuerModel);
            }
        }
        return arrayList;
    }
}
