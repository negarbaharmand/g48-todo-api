package se.lexicon.g48todoapi.converter;

import org.springframework.stereotype.Component;
import se.lexicon.g48todoapi.domain.dto.RoleDTOView;
import se.lexicon.g48todoapi.domain.entity.Role;

@Component
public class RoleConverterImpl implements RoleConverter {
    @Override
    public RoleDTOView toRoleDTOView(Role entity) {

        return RoleDTOView.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();

        /*RoleDTOView roleDTOView = new RoleDTOView();
        roleDTOView.setId(entity.getId());
        roleDTOView.setName(entity.getName());
        return roleDTOView;*/
    }

    @Override
    public Role toRoleEntity(RoleDTOView dtoView) {
        return Role.builder()
                .id(dtoView.getId())
                .name(dtoView.getName())
                .build();
        //return new Role(dtoView.getId(), dtoView.getName());
    }
}
