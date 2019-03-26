import React from 'react';
import { connect } from 'react-redux';
import { Link, RouteComponentProps } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
// tslint:disable-next-line:no-unused-variable
import { Translate, ICrudGetAction } from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { IRootState } from 'app/shared/reducers';
import { getEntity } from './banner.reducer';
import { IBanner } from 'app/shared/model/banner.model';
// tslint:disable-next-line:no-unused-variable
import { APP_DATE_FORMAT, APP_LOCAL_DATE_FORMAT } from 'app/config/constants';

export interface IBannerDetailProps extends StateProps, DispatchProps, RouteComponentProps<{ id: string }> {}

export class BannerDetail extends React.Component<IBannerDetailProps> {
  componentDidMount() {
    this.props.getEntity(this.props.match.params.id);
  }

  render() {
    const { bannerEntity } = this.props;
    return (
      <Row>
        <Col md="8">
          <h2>
            <Translate contentKey="jhipsterWebsocketApp.banner.detail.title">Banner</Translate> [<b>{bannerEntity.id}</b>]
          </h2>
          <dl className="jh-entity-details">
            <dt>
              <span id="banner">
                <Translate contentKey="jhipsterWebsocketApp.banner.banner">Banner</Translate>
              </span>
            </dt>
            <dd>{bannerEntity.banner}</dd>
            <dt>
              <span id="describs">
                <Translate contentKey="jhipsterWebsocketApp.banner.describs">Describs</Translate>
              </span>
            </dt>
            <dd>{bannerEntity.describs}</dd>
            <dt>
              <span id="isdelete">
                <Translate contentKey="jhipsterWebsocketApp.banner.isdelete">Isdelete</Translate>
              </span>
            </dt>
            <dd>{bannerEntity.isdelete}</dd>
          </dl>
          <Button tag={Link} to="/entity/banner" replace color="info">
            <FontAwesomeIcon icon="arrow-left" />{' '}
            <span className="d-none d-md-inline">
              <Translate contentKey="entity.action.back">Back</Translate>
            </span>
          </Button>
          &nbsp;
          <Button tag={Link} to={`/entity/banner/${bannerEntity.id}/edit`} replace color="primary">
            <FontAwesomeIcon icon="pencil-alt" />{' '}
            <span className="d-none d-md-inline">
              <Translate contentKey="entity.action.edit">Edit</Translate>
            </span>
          </Button>
        </Col>
      </Row>
    );
  }
}

const mapStateToProps = ({ banner }: IRootState) => ({
  bannerEntity: banner.entity
});

const mapDispatchToProps = { getEntity };

type StateProps = ReturnType<typeof mapStateToProps>;
type DispatchProps = typeof mapDispatchToProps;

export default connect(
  mapStateToProps,
  mapDispatchToProps
)(BannerDetail);
