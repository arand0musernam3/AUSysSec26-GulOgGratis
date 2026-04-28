package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ModuleDependenciesImpl implements ModuleDependencies {

    @NotNull
    private final List<ModuleDescriptorImpl> allDependencies;

    @NotNull
    private final Set<ModuleDescriptorImpl> allExpectedByDependencies;

    @NotNull
    private final List<ModuleDescriptorImpl> directExpectedByDependencies;

    @NotNull
    private final Set<ModuleDescriptorImpl> modulesWhoseInternalsAreVisible;

    public ModuleDependenciesImpl(@NotNull List<ModuleDescriptorImpl> list, @NotNull Set<ModuleDescriptorImpl> set, @NotNull List<ModuleDescriptorImpl> list2, @NotNull Set<ModuleDescriptorImpl> set2) {
        list.getClass();
        set.getClass();
        list2.getClass();
        set2.getClass();
        this.allDependencies = list;
        this.modulesWhoseInternalsAreVisible = set;
        this.directExpectedByDependencies = list2;
        this.allExpectedByDependencies = set2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    public List<ModuleDescriptorImpl> getAllDependencies() {
        return this.allDependencies;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    public List<ModuleDescriptorImpl> getDirectExpectedByDependencies() {
        return this.directExpectedByDependencies;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    public Set<ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible() {
        return this.modulesWhoseInternalsAreVisible;
    }
}
