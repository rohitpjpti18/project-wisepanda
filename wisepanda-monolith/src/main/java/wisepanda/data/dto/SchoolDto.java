package wisepanda.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wisepanda.data.enums.AffiliationType;

import java.io.Serializable;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDto implements Serializable {
    private Long id;
    private String name;
    private AffiliationType affiliation;
    private OrganisationDto organisation;
    private ContactDto contact;
}
